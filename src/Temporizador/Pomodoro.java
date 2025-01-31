/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporizador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import Controlador.TareaController;
import Modelos.Tarea;

/**
 *
 * @author luisr
 */
public class Pomodoro extends JFrame {
    private Tarea tarea;

    // Componentes de la interfaz
    private JLabel etiquetaTiempo; // Muestra el tiempo restante
    private JLabel etiquetaEstado; // Muestra si es tiempo de enfoque o descanso
    private JButton botonControl; // Botón para iniciar/pausar/reanudar el temporizador
    private JButton botonFinalizar; // Botón para finalizar la tarea

    // Variables para el temporizador
    private Timer temporizador; // Objeto Timer para controlar el tiempo
    private int tiempoRestante; // Tiempo restante en segundos
    private boolean enTiempoEnfoque; // Indica si está en tiempo de enfoque o descanso
    private boolean corriendo; // Indica si el temporizador está en ejecución
    private int tiempoTotal; // Tiempo total acumulado en segundos
    private Integer numeroPomodoros;
    private TareaController tareaController = new TareaController();

    public Pomodoro(Tarea tarea) {
        this.tarea = tarea;
        // Configuración de la ventana principal
        setTitle("Temporizador Pomodoro");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        getContentPane().setBackground(new Color(40, 40, 40)); // Fondo oscuro

        // Etiqueta para mostrar el tiempo restante
        // etiquetaTiempo = new JLabel("25:00", SwingConstants.CENTER);
        String tiempo = this.tarea.getTiempoEnfoque() + ":00";
        etiquetaTiempo = new JLabel(tiempo, SwingConstants.CENTER);

        etiquetaTiempo.setFont(new Font("Arial", Font.BOLD, 48));
        etiquetaTiempo.setForeground(Color.WHITE); // Color del texto
        add(etiquetaTiempo, BorderLayout.CENTER);

        // Etiqueta para mostrar el estado actual
        etiquetaEstado = new JLabel("Tiempo de enfoque", SwingConstants.CENTER);
        etiquetaEstado.setFont(new Font("Arial", Font.PLAIN, 20));
        etiquetaEstado.setForeground(Color.LIGHT_GRAY); // Texto más claro
        add(etiquetaEstado, BorderLayout.NORTH);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 2, 10, 10));
        panelBotones.setBackground(new Color(40, 40, 40));

        // Botón para controlar el temporizador
        botonControl = new JButton("Iniciar");
        botonControl.setFont(new Font("Arial", Font.PLAIN, 20));
        botonControl.setBackground(new Color(60, 179, 113)); // Color verde
        botonControl.setForeground(Color.WHITE); // Texto blanco
        botonControl.addActionListener(e -> controlarTemporizador());
        panelBotones.add(botonControl);

        // Botón para finalizar la tarea
        botonFinalizar = new JButton("Finalizar Tarea");
        botonFinalizar.setFont(new Font("Arial", Font.PLAIN, 20));
        botonFinalizar.setBackground(new Color(220, 20, 60)); // Color rojo
        botonFinalizar.setForeground(Color.WHITE); // Texto blanco
        botonFinalizar.addActionListener(e -> finalizarTarea());
        panelBotones.add(botonFinalizar);

        add(panelBotones, BorderLayout.SOUTH);

        // Inicialización de variables
        temporizador = new Timer();
        enTiempoEnfoque = true; // Comienza con tiempo de enfoque
        corriendo = false; // El temporizador no está corriendo al principio
        tiempoTotal = 0; // Inicializa el tiempo total a 0
        numeroPomodoros = this.tarea.getNumeroPomodoros();
    }

    // Método para controlar el temporizador (iniciar, pausar, reanudar)
    private void controlarTemporizador() {
        if (corriendo) {
            pausarTemporizador();
        } else {
            iniciarTemporizador();
        }
    }

    // Método para iniciar o reanudar el temporizador
    private void iniciarTemporizador() {
        if (!corriendo) {
            if (tiempoRestante == 0) { // Configurar tiempo inicial si es la primera vez
                // Multiplicar por 60 para convertir minutos a segundos
                tiempoRestante = enTiempoEnfoque ? this.tarea.getTiempoEnfoque() * 60 : 5 * 60;
            }
            corriendo = true;
            botonControl.setText("Pausar");
            botonControl.setBackground(new Color(220, 20, 60)); // Cambia el botón a color rojo

            temporizador.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    if (tiempoRestante > 0) {
                        tiempoRestante--;
                        tiempoTotal++;
                        actualizarEtiquetaTiempo();
                    } else {
                        terminarCiclo();
                    }
                }
            }, 0, 1000);
        }
    }

    // Método para pausar el temporizador
    private void pausarTemporizador() {
        corriendo = false;
        temporizador.cancel();
        temporizador = new Timer(); // Reinicia el objeto Timer
        botonControl.setText("Reanudar");
        botonControl.setBackground(new Color(60, 179, 113)); // Cambia el botón a color verde
    }

    // Método para finalizar un ciclo (enfoque o descanso)
    private void terminarCiclo() {
        // Aumentar el número de pomodoros si es tiempo de enfoque
        if (enTiempoEnfoque) {
            numeroPomodoros++;
            tarea.setNumeroPomodoros(numeroPomodoros);
            tareaController.actualizarTarea(tarea);
        }
        temporizador.cancel();
        temporizador = new Timer(); // Reinicia el objeto Timer
        enTiempoEnfoque = !enTiempoEnfoque; // Cambia entre enfoque y descanso
        tiempoRestante = 0; // Reinicia el tiempo
        corriendo = false; // Detiene el temporizador
        botonControl.setText("Iniciar");
        botonControl.setBackground(new Color(60, 179, 113)); // Botón verde
        etiquetaTiempo.setText(enTiempoEnfoque ? "25:00" : "05:00");
        etiquetaEstado.setText(enTiempoEnfoque ? "Tiempo de enfoque" : "Tiempo de descanso");
        getContentPane().setBackground(enTiempoEnfoque ? new Color(40, 40, 40) : new Color(70, 130, 180)); // Cambia el
                                                                                                           // fondo
        iniciarTemporizador(); // Inicia automáticamente el siguiente ciclo
    }

    // Método para finalizar la tarea y mostrar el tiempo total
    private void finalizarTarea() {
        temporizador.cancel();
        int horas = tiempoTotal / 3600;
        int minutos = (tiempoTotal % 3600) / 60;
        int segundos = tiempoTotal % 60;
        JOptionPane.showMessageDialog(this,
                String.format("Tarea finalizada.\nTiempo total: %02d:%02d:%02d", horas, minutos, segundos),
                "Resumen de la tarea",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); // Cierra la aplicación
    }

    // Método para actualizar la etiqueta del tiempo
    private void actualizarEtiquetaTiempo() {
        int minutos = tiempoRestante / 60;
        int segundos = tiempoRestante % 60;
        etiquetaTiempo.setText(String.format("%02d:%02d", minutos, segundos));
    }

    // Método principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Pomodoro pomodoroTimer = new Pomodoro(null);
            pomodoroTimer.setVisible(true); // Asegúrate de que esta línea no esté comentada
        });
    }
}
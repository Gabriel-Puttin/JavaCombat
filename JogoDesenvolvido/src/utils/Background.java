package utils;

import javax.swing.*;
import java.awt.*;

public class Background {
    private static JFrame frame;
    private static JTextArea outputArea;

    public static void BackgroundUI() {
        frame = new JFrame("Jogo com Fundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

        java.net.URL imgURL = Background.class.getResource("/resources/IndieGameBackground.jpg");

        if (imgURL == null) {
            JOptionPane.showMessageDialog(null, "Arquivo de imagem não encontrado: /resources/IndieGameBackground.jpg", 
                                         "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ImageIcon originalIcon = new ImageIcon(imgURL);
        Image scaledImage = originalIcon.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel backgroundLabel = new JLabel(scaledIcon);
        backgroundLabel.setLayout(new BorderLayout());
        frame.setContentPane(backgroundLabel);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setOpaque(false);
        outputArea.setForeground(Color.WHITE);
        outputArea.setFont(new Font("Monospaced", Font.BOLD, 20));
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);

        JPanel transparentPanel = new JPanel(new BorderLayout());
        transparentPanel.setOpaque(false);
        transparentPanel.add(scrollPane, BorderLayout.CENTER);

        backgroundLabel.add(transparentPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void print(String message) {
        if (outputArea != null) {
            outputArea.append(message + "\n");
        } else {
            System.out.println(message);
        }
    }
}

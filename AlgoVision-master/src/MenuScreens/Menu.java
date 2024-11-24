package MenuScreens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ImagePane extends JPanel {
    private Image backgroundImage;

    public ImagePane(Image bgImage) {
        this.backgroundImage = bgImage;
        this.setLayout(null);  // Enable absolute positioning for components
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            // Draw the image to fit the entire panel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

public class Menu {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    Toolkit t = Toolkit.getDefaultToolkit();
    JFrame c;
    JLabel label1;
    Image bgpic = t.getImage("./MenuScreens/Vital-Functions-of-DSA-Loan-Agents-3.jpg");
    JPanel pp;
    JButton btn1, btn2, btn3;
    Font f, f1;
    public Color blueColor = new Color(112, 213, 202);
    public Color pinkColor = new Color(226, 86, 186);

    public Menu() {
        initComponents();
    }

    public void initComponents() {
        c = new JFrame("Data Structure and Algorithm Visualizer");
        c.setLayout(null);
        c.setBackground(Color.black);
        c.setBounds(0, 0, WIDTH, HEIGHT);
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the custom ImagePanel with the background image
        pp = new ImagePane(bgpic);
        pp.setBounds(0, 0, WIDTH, HEIGHT);
        pp.setBackground(blueColor);  // This won't be visible since the image will cover it
        pp.setBorder(BorderFactory.createLineBorder(Color.black));
        pp.setLayout(null);

        f = new Font("Futura", Font.BOLD, 40);
        f1 = new Font("Century Gothic", Font.PLAIN, 20);

        label1 = new JLabel("ALGOVISION", SwingConstants.CENTER);
        label1.setBounds((WIDTH / 2) - 500, 100, 1000, 50);
        label1.setFont(f);
        label1.setForeground(Color.BLUE.darker());
        pp.add(label1);

        btn1 = new JButton("Data Structures");
        btn1.setBounds((WIDTH / 2) - 150, 250, 300, 50);
        btn1.setForeground(Color.white);
        btn1.setBackground(pinkColor);
        btn1.setBorder(BorderFactory.createLineBorder(Color.black.darker(), 2));

      //  btn1.getBorder(Box.createHorizontalBox());
        btn1.setFont(f1);
        btn1.setFocusable(false);
      //  btn1.setBorder(null);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.dispose();
                new DataStructure();
            }
        });
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (btn1.isEnabled())
                    btn1.setBackground(Color.darkGray.darker().darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1.setBackground(pinkColor);
            }
        });
        pp.add(btn1);

        btn2 = new JButton("Algorithms");
        btn2.setBounds((WIDTH / 2) - 150, 325, 300, 50);
        btn2.setForeground(Color.white);
        btn2.setBackground(pinkColor);
        btn2.setBorder(BorderFactory.createLineBorder(Color.black.darker(), 2));
        btn2.setFont(f1);
        btn2.setFocusable(false);
       // btn2.setBorder(null);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.dispose();
                new Algorithms();
            }
        });
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (btn2.isEnabled())
                    btn2.setBackground(Color.darkGray.darker().darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2.setBackground(pinkColor);
            }
        });
        pp.add(btn2);

        btn3 = new JButton("Exit");
        btn3.setBounds((WIDTH / 2) - 150, 400, 300, 50);
        btn3.setForeground(Color.white);
        btn3.setBackground(pinkColor);
        btn3.setBorder(BorderFactory.createLineBorder(Color.black.darker(), 2));
        btn3.setFont(f1);
        btn3.setFocusable(false);
       // btn3.setBorder(null);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (btn3.isEnabled())
                    btn3.setBackground(Color.darkGray.darker().darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3.setBackground(pinkColor);
            }
        });
        pp.add(btn3);

        pp.setVisible(true);
        c.add(pp);
        c.setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}

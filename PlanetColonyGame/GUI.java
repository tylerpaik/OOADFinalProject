// package PlanetColonyGame;
// import java.awt.*;  //literally didn't use any of this
// import javax.swing.*; //tutorial from https://www.youtube.com/watch?v=bn8MDLsubOQ&ab_channel=RyiSnow

// public class GUI {
//     JFrame frame;
//     Font font;          
//     public JTextArea message;
//     GUI(){
//         this.font = new Font("Book Antiqua", Font.PLAIN, 18);
//         frameSetup();
//         frame.setVisible(true);
//         createText();
//         createButton();
//     }
//     private void frameSetup(){

//         //create the window.
//         frame = new JFrame("FrameDemo");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         JLabel emptyLabel = new JLabel("");
//         emptyLabel.setPreferredSize(new Dimension(800, 600));
//         frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
//         frame.getContentPane().setBackground(Color.black);
//         frame.pack(); 
//         frame.setLayout(null);
        
//     }
//     private void createText(){
//         //create the area where text will be displayed.
//         message = new JTextArea("Sample Text.");
//         message.setBounds(50,400,700,150);
//         message.setBackground(Color.blue);
//         message.setForeground(Color.white);
//         message.setEditable(false);
//         message.setLineWrap(true);
//         message.setWrapStyleWord(true);
//         message.setFont(font);
        
//         //take care of line wrapping and breaking.
        
//         frame.add(message);
//     }
//     private void createButton(){
//         JButton button;
//         JPanel buttonPanel = new JPanel();
//         buttonPanel.setBounds(300,250,200,250);
//         buttonPanel.setBackground(Color.black);

//         button = new JButton("TEST TEST");
//         button.setFont(font);
//         button.setBackground(Color.black);
//         button.setForeground(Color.white);
        
//         buttonPanel.add(button);
//         frame.add(buttonPanel);
//     }
// }

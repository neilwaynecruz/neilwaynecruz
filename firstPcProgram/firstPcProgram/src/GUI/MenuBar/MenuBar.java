package GUI.MenuBar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar extends JFrame implements ActionListener {

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

   public MenuBar(){

       menuBar.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.GRAY));
       menuBar.setPreferredSize(new Dimension(328, 20));
       menuBar.add(fileMenu);fileMenu.setMnemonic('F'); // or fileMenu.setMnemonic(KeyEvent.VK_F);
       menuBar.add(editMenu);editMenu.setMnemonic('E'); // or editMenu.setMnemonic(KeyEvent.VK_E);
       menuBar.add(helpMenu);helpMenu.setMnemonic('H'); // or helpMenu.setMnemonic(KeyEvent.VK_H);

       fileMenu.add(loadItem); loadItem.addActionListener(this); loadItem.setMnemonic('L');
       fileMenu.add(saveItem); saveItem.addActionListener(this); saveItem.setMnemonic('S');
       fileMenu.add(exitItem); exitItem.addActionListener(this); exitItem.setMnemonic('E');



       add(menuBar);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout(FlowLayout.LEFT));
       setSize(350,350);
       setResizable(false);
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

       if(e.getSource() == loadItem){
           System.out.println("Load the Files");
       }

       if(e.getSource() == saveItem){
           System.out.println("Saved the Files");
       }

       if(e.getSource() == exitItem){
           System.out.println("Exit Program");
           dispose();
       }
    }

    public static void main(String[] args) {
        new MenuBar();
    }
}

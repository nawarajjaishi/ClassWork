/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

/**
 *
 * @author Jaction76
 * 
 */
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.jvnet.substance.skin.SubstanceAutumnLookAndFeel;
import org.jvnet.substance.skin.SubstanceEmeraldDuskLookAndFeel;
import org.jvnet.substance.skin.SubstanceMangoLookAndFeel;

public class LookAndFeelDemo extends JFrame{
    
    private JComboBox comboBox;
    private JButton bttn1, bttn2;
    private JToggleButton toggleBtn;
    private JLabel toggleLabel;
    
    public LookAndFeelDemo(){
        setLayout(new FlowLayout());
        comboBox = new JComboBox();
        comboBox.addItem("Windows");
        comboBox.addItem("Nimbus");
        comboBox.addItem("Motif");
        comboBox.addItem("Metal");
        comboBox.addItem("Autum");
        comboBox.addItem("Emerald");
        comboBox.addItem("Mango");
        
        comboBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                try {
                    changeLookAndFeel(comboBox.getSelectedItem().toString());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LookAndFeelDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
                repaint();
            }
        });
        
        add(comboBox);
        
        bttn1 = new JButton("Submit");
        bttn2 = new JButton("Refresh");
        add(bttn1);
        add(bttn2);
        
        toggleBtn = new JToggleButton("Off");
        toggleBtn.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(toggleBtn.isSelected()){
                    toggleBtn.setText("ON");
                }else{
                     toggleBtn.setText("OFF");
                }
            }
        });
        add(toggleBtn);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void changeLookAndFeel(String look) throws UnsupportedLookAndFeelException{
        switch(look){
            case "Windows":
                UIManager.setLookAndFeel(new WindowsLookAndFeel());
                break;
            case "Nimbus":
                UIManager.setLookAndFeel(new NimbusLookAndFeel());
                break;
            case "Motif":
                UIManager.setLookAndFeel(new MotifLookAndFeel());
                break;
            case "Autum":
                UIManager.setLookAndFeel(new SubstanceAutumnLookAndFeel());
                break;
            case "Emerald":
                UIManager.setLookAndFeel(new SubstanceEmeraldDuskLookAndFeel());
                break;
            case "Mango":
                UIManager.setLookAndFeel(new SubstanceMangoLookAndFeel());
                break;
            default:
                UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
    }
    
    public static void main(String[] args) {
        new LookAndFeelDemo();
    }
}


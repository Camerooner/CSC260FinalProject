import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cam
 */
public class MainWindow extends javax.swing.JFrame {
    
    private JTabbedPane tabbedPane;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        
        // Sets up the main window properties
        setTitle("Recipe Finder & Meal Planner");
        setResizable(false); // Makes it so that the window cannot be resized
        setLocationRelativeTo(null); // Centers the window to the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(625, 550));
        pack(); // Adjust window size to fit components
        getContentPane().add(startButton, BorderLayout.CENTER);
        getContentPane().setLayout(new BorderLayout()); 
   
        tabbedPane = new JTabbedPane();
        
        // Initializes the panels
        RecipesPanel recipesPanel = new RecipesPanel();
        MealPlannerPanel mealPlannerPanel = new MealPlannerPanel();
        SettingsPanel settingsPanel = new SettingsPanel();
        
         // Add tabs for each panel
        tabbedPane.addTab("Find Recipes", recipesPanel);
        tabbedPane.addTab("Meal Planner", mealPlannerPanel);
        tabbedPane.addTab("Settings", settingsPanel);
        
        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                getContentPane().remove(startButton);
                titleLabel.setVisible(false);
                getContentPane().add(tabbedPane, BorderLayout.CENTER);
                getContentPane().revalidate();
                getContentPane().repaint();
                
                savedRecipesButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    showSavedRecipes();
                }
            });

                helpButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        showHelp();
                }
            });

                }
        });
    }
    
    private void showSavedRecipes() {
        JOptionPane.showMessageDialog(this, "Saved recipes functionality not implemented yet.");
    }

    private void showHelp() {
        JOptionPane.showMessageDialog(this, "Help functionality not implemented yet.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpButton = new javax.swing.JButton();
        savedRecipesButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 650));

        helpButton.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        savedRecipesButton.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        savedRecipesButton.setText("Saved Recipes");

        startButton.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        startButton.setText("Start!");

        titleLabel.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        titleLabel.setText("Official Recipe Finder and Meal Planner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLabel)
                            .addComponent(savedRecipesButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(helpButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpButton)
                    .addComponent(savedRecipesButton))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed

    }//GEN-LAST:event_helpButtonActionPerformed

    private void fileBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        showSavedRecipes();
    }                                       

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        showHelp();
    }       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//        // Sets the systems look & feel to metal
//          UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
        
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            FlatLightLaf.setup();
            new MainWindow().setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpButton;
    private javax.swing.JButton savedRecipesButton;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

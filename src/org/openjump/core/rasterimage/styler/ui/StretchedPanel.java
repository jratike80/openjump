package org.openjump.core.rasterimage.styler.ui;

import com.vividsolutions.jump.util.Range;

import com.vividsolutions.jump.workbench.Logger;
import org.openjump.core.rasterimage.styler.ColorMapEntry;
import org.openjump.core.rasterimage.RasterSymbology;

import java.util.ResourceBundle;

/**
 *
 * @author GeomaticaEAmbiente
 */
public class StretchedPanel extends javax.swing.JPanel {

    /**
     * Creates new form StretchedPanel
     * @param range range of pixel values
     */
    public StretchedPanel(Range range) {

        initComponents();

        minValue = (Double) range.getMin();
        maxValue = (Double) range.getMax();

        fixComponents();
        
    }

    public void reset() {

        try {
            jCheckBox_Invert.setSelected(false);
            comboBox_Gradient.setSelectedIndex(0);
            comboBox_Gradient.getModel().getElementAt(0);
            ColorMapEntry[] paletteColorMapEntries = ((GradientCanvas) comboBox_Gradient.getModel().getElementAt(0)).getColorMapEntries();
            updateRasterStyler(paletteColorMapEntries);
            GUIUtils utils = new GUIUtils();
            utils.setGradientPanel(jPanel_ShowGradient, paletteColorMapEntries);
            this.updateUI();
        } catch (Exception ex){
            Logger.error(ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel_Value = new javax.swing.JLabel();
        jLabel_MinLabel = new javax.swing.JLabel();
        jLabel_MinValue = new javax.swing.JLabel();
        jLabel_MaxLabel = new javax.swing.JLabel();
        jLabel_MaxValue = new javax.swing.JLabel();
        jPanel_ShowGradient = new javax.swing.JPanel();
        jButton_Custom = new javax.swing.JButton();
        jCheckBox_Invert = new javax.swing.JCheckBox();

        setAlignmentY(0.0F);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(365, 160));
        setMinimumSize(new java.awt.Dimension(365, 160));
        setPreferredSize(new java.awt.Dimension(365, 160));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        jLabel_Value.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/openjump/core/rasterimage/styler/resources/Bundle"); // NOI18N
        jLabel_Value.setText(bundle.getString("org.openjump.core.rasterimage.styler.ui.StretchedPanel.jLabel_Value.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(jLabel_Value, gridBagConstraints);

        jLabel_MinLabel.setText(bundle.getString("org.openjump.core.rasterimage.styler.ui.StretchedPanel.jLabel_MinLabel.text")); // NOI18N
        jLabel_MinLabel.setMaximumSize(new java.awt.Dimension(83, 14));
        jLabel_MinLabel.setMinimumSize(new java.awt.Dimension(83, 14));
        jLabel_MinLabel.setPreferredSize(new java.awt.Dimension(83, 14));
        jLabel_MinLabel.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_MinLabel, gridBagConstraints);

        jLabel_MinValue.setText(bundle.getString("org.openjump.core.rasterimage.styler.ui.StretchedPanel.jLabel_MinValue.text")); // NOI18N
        jLabel_MinValue.setMaximumSize(new java.awt.Dimension(83, 14));
        jLabel_MinValue.setMinimumSize(new java.awt.Dimension(83, 14));
        jLabel_MinValue.setPreferredSize(new java.awt.Dimension(83, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_MinValue, gridBagConstraints);

        jLabel_MaxLabel.setText(bundle.getString("org.openjump.core.rasterimage.styler.ui.StretchedPanel.jLabel_MaxLabel.text")); // NOI18N
        jLabel_MaxLabel.setToolTipText(bundle.getString("org.openjump.core.rasterimage.styler.ui.StretchedPanel.jLabel_MaxLabel.toolTipText")); // NOI18N
        jLabel_MaxLabel.setMaximumSize(new java.awt.Dimension(83, 14));
        jLabel_MaxLabel.setMinimumSize(new java.awt.Dimension(83, 14));
        jLabel_MaxLabel.setPreferredSize(new java.awt.Dimension(83, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_MaxLabel, gridBagConstraints);

        jLabel_MaxValue.setText(bundle.getString("org.openjump.core.rasterimage.styler.ui.StretchedPanel.jLabel_MaxValue.text")); // NOI18N
        jLabel_MaxValue.setMaximumSize(new java.awt.Dimension(83, 14));
        jLabel_MaxValue.setMinimumSize(new java.awt.Dimension(83, 14));
        jLabel_MaxValue.setPreferredSize(new java.awt.Dimension(83, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_MaxValue, gridBagConstraints);

        jPanel_ShowGradient.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_ShowGradient.setMinimumSize(new java.awt.Dimension(80, 75));
        jPanel_ShowGradient.setPreferredSize(new java.awt.Dimension(73, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel_ShowGradient, gridBagConstraints);

        jButton_Custom.setText(bundle.getString("org.openjump.core.rasterimage.styler.ui.StretchedPanel.jButton_Custom.text")); // NOI18N
        jButton_Custom.addActionListener(this::jButton_CustomActionPerformed);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jButton_Custom, gridBagConstraints);

        jCheckBox_Invert.setText(bundle.getString("org.openjump.core.rasterimage.styler.ui.StretchedPanel.jCheckBox_Invert.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        add(jCheckBox_Invert, gridBagConstraints);
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {

        //Set label for elevation
        jLabel_MinValue.setText(Double.toString(GUIUtils.round(minValue, 3)));
        jLabel_MaxValue.setText(Double.toString(GUIUtils.round(maxValue, 3)));
        
    }

    private void jButton_CustomActionPerformed(java.awt.event.ActionEvent evt) {
             
        customGradient();
        
    }

    private void comboBox_GradientActionPerformed(java.awt.event.ActionEvent evt) {
        
        try{
            if (comboBox_Gradient != null) {                
                
                ColorMapEntry[] paletteColorMapEntries = ((GradientCanvas) comboBox_Gradient.getSelectedItem()).getColorMapEntries();
                updateRasterStyler(paletteColorMapEntries);
                
                GUIUtils utils = new GUIUtils();
                utils.setGradientPanel(jPanel_ShowGradient, paletteColorMapEntries);            
            }
        } catch (Exception ex){
            Logger.error(ex);
        }
    }

    private void fixComponents() {
         
        setComboBox();
        GUIUtils.addGradientComboBoxToList(comboBox_Gradient);
        
        GradientCanvas gradientCanvas = (GradientCanvas) comboBox_Gradient.getItemAt(0);
        colorMapEntries = gradientCanvas.getColorMapEntries();
        
        rasterSymbology = new RasterSymbology(RasterSymbology.TYPE_RAMP);
        updateRasterStyler(colorMapEntries);

        GUIUtils utils = new GUIUtils();
        utils.setGradientPanel(jPanel_ShowGradient, colorMapEntries);   
    
    }

    private void setComboBox() {

        comboBox_Gradient = GUIUtils.createStandardGradientComboBox(width, height);
        comboBox_Gradient.addActionListener(this::comboBox_GradientActionPerformed);

        java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 1.0; 
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(comboBox_Gradient, gridBagConstraints);

    }

    private void customGradient(){
        
        GradientCanvas gradientCanvas = (GradientCanvas) comboBox_Gradient.getSelectedItem();
        ColorMapEntry[] coloMapEntries = gradientCanvas.getColorMapEntries();
        
        CustomGradientColorsDialog customGradientDialog = new CustomGradientColorsDialog(null, true, coloMapEntries);
        customGradientDialog.setLocationRelativeTo(this);
        customGradientDialog.setVisible(true);
                
        ColorMapEntry[] newGradient = customGradientDialog.getColorMapEntries();
        if(newGradient != null){

            GUIUtils.updateGradientComboBoxes(newGradient, width, height);
            comboBox_Gradient.setSelectedIndex(comboBox_Gradient.getItemCount()-1);
            
        }
        
    }
    
    private void updateRasterStyler(ColorMapEntry[] colorMapEntries) {
        
        rasterSymbology = new RasterSymbology(RasterSymbology.TYPE_RAMP);
        for (ColorMapEntry paletteColorMapEntrie : colorMapEntries) {
            double quantity = (maxValue - minValue) * paletteColorMapEntrie.getUpperValue() + minValue;
            rasterSymbology.addColorMapEntry(quantity, paletteColorMapEntrie.getColor());
        }

    }
    
    public void plugRasterSymbology(RasterSymbology rasterSymbology) throws Exception {
        
        colorMapEntries = rasterSymbology.getColorMapEntries();
        
        // Convert values to relative values
        ColorMapEntry[] relColMapEntries = new ColorMapEntry[rasterSymbology.getColorMapEntries().length];
        double minVal = 0;
        if(rasterSymbology.getColorMapEntries()[0].getColor() != null) {
            minVal = rasterSymbology.getColorMapEntries()[0].getUpperValue();
        } else {
            minVal = rasterSymbology.getColorMapEntries()[1].getUpperValue();
        }
        double maxVal = rasterSymbology.getColorMapEntries()[rasterSymbology.getColorMapEntries().length-1].getUpperValue();

        relColMapEntries[0] = new ColorMapEntry(0, rasterSymbology.getColorMapEntries()[0].getColor());
        for(int i=1; i<rasterSymbology.getColorMapEntries().length; i++) {
            double relVal = (rasterSymbology.getColorMapEntries()[i].getUpperValue() - minVal)  / (maxVal - minVal);
            relColMapEntries[i] = new ColorMapEntry(relVal, rasterSymbology.getColorMapEntries()[i].getColor());
        }

        GUIUtils.updateGradientComboBoxes(relColMapEntries, width, height);
        comboBox_Gradient.setSelectedIndex(comboBox_Gradient.getItemCount()-1);
    
    }
            
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Custom;
    private javax.swing.JCheckBox jCheckBox_Invert;
    private javax.swing.JLabel jLabel_MaxLabel;
    private javax.swing.JLabel jLabel_MaxValue;
    private javax.swing.JLabel jLabel_MinLabel;
    private javax.swing.JLabel jLabel_MinValue;
    private javax.swing.JLabel jLabel_Value;
    private javax.swing.JPanel jPanel_ShowGradient;
    // End of variables declaration//GEN-END:variables

    private final double minValue;
    private final double maxValue;
    private ColorMapEntry[] colorMapEntries;
    private GradientComboBox comboBox_Gradient;
    private RasterSymbology rasterSymbology; 
    private final int width = 200;
    private final int height = 18;
    
    public RasterSymbology getRasterStyler(){
        
        if(jCheckBox_Invert.isSelected()) {
            RasterSymbology revRasterSymbology = new RasterSymbology(rasterSymbology.getColorMapType());
            
            int firstEntry = 0;
            if(rasterSymbology.getColorMapEntries()[0].getColor() == null) {
                revRasterSymbology.addColorMapEntry(
                        rasterSymbology.getColorMapEntries()[0].getUpperValue(),
                        rasterSymbology.getColorMapEntries()[0].getColor());
                firstEntry = 1;
            }
            
            int up = rasterSymbology.getColorMapEntries().length - 1 + firstEntry;
            for(int cme=firstEntry; cme<rasterSymbology.getColorMapEntries().length; cme++) {
                revRasterSymbology.addColorMapEntry(
                        rasterSymbology.getColorMapEntries()[cme].getUpperValue(),
                        rasterSymbology.getColorMapEntries()[up-cme].getColor());
            }
            return revRasterSymbology;
            
        }        
        
        return rasterSymbology;
    }

}

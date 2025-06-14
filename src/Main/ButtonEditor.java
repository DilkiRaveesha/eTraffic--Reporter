/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

import Model.DBConnection;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Dilki Raveesha
 */
public class ButtonEditor extends DefaultCellEditor {
    private JButton button;
    private JTable table;
    private GenerateFine generateFine; // 👈 Reference to your main window

    public ButtonEditor(JCheckBox checkBox, JTable table, GenerateFine generateFine) {
        super(checkBox);
        this.table = table;
        this.generateFine = generateFine;

        button = new JButton("Print");
        button.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                generateFine.exportRowToPDF(row); // ✅ Now this will work!
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean selected, int row, int column) {
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return "Print";
    }
}

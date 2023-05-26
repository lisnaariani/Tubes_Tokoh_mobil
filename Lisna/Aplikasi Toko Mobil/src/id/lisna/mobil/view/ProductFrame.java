package id.lisna.mobil.view;

import id.lisna.mobil.controller.CategoryController;
import id.lisna.mobil.controller.ProductController;
import id.lisna.mobil.database.DatabaseMySQL;
import id.lisna.mobil.model.Category;
import id.lisna.mobil.model.CrudState;
import static id.lisna.mobil.model.CrudState.UPDATE;
import id.lisna.mobil.model.Product;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class ProductFrame extends javax.swing.JFrame implements Observer{

    private ProductController productController = new ProductController();
    private CategoryController categoryController = new CategoryController();
    DefaultTableModel tableModel;

    public ProductFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        productController.addObserver(this);
        setCategory(categoryController.getAllData());
        setProductTable(productController.getAllProduct());
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);

        if (!DatabaseMySQL.isConnect()){
            System.exit(0);
        }
        id_txtfield.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name_txtfield = new javax.swing.JTextField();
        price_txtfield = new javax.swing.JTextField();
        category_combobox = new javax.swing.JComboBox();
        isAvailable_checkbox = new javax.swing.JCheckBox();
        save_button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stock_txtfield1 = new javax.swing.JTextField();
        id_txtfield = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        warna = new javax.swing.JTextField();

        jLabel7.setText("jLabel7");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Tambah Daftar :");

        jLabel2.setText("Merk Mobil");

        jLabel3.setText("Harga");

        jLabel4.setText("Stok");

        jLabel5.setText("Kategori");

        price_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_txtfieldActionPerformed(evt);
            }
        });

        category_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        isAvailable_checkbox.setText("Produk Tersedia");
        isAvailable_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAvailable_checkboxActionPerformed(evt);
            }
        });

        save_button.setBackground(new java.awt.Color(51, 102, 255));
        save_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        save_button.setForeground(new java.awt.Color(255, 255, 255));
        save_button.setText("Simpan");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Daftar Mobil");

        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(product_table);

        updateBtn.setBackground(new java.awt.Color(51, 204, 0));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setAutoscrolls(true);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel9.setText("TOKO MOBIL LISNA");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setText("ID");

        id_txtfield.setToolTipText("");
        id_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtfieldActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("Warna ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(price_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stock_txtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(category_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(warna, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deleteBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(updateBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(save_button)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(192, 192, 192))))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isAvailable_checkbox)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id_txtfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6))
                    .addComponent(price_txtfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stock_txtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(isAvailable_checkbox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn)
                    .addComponent(save_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        String name = name_txtfield.getText();
        float price = Float.valueOf(price_txtfield.getText());
        int stock = Integer.parseInt(stock_txtfield1.getText());
        Category category = (Category) category_combobox.getSelectedItem();
        boolean isFavorite = isAvailable_checkbox.isSelected();
        String warnaData = warna.getText();

        Product p = new Product(0, name, price, stock, category, isFavorite,warnaData);        
        productController.manipulate(p,CrudState.INSERT);
    }//GEN-LAST:event_save_buttonActionPerformed

    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        // TODO add your handling code here:
        
       tblKeForm();
    }//GEN-LAST:event_product_tableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(id_txtfield.getText());
        String name = name_txtfield.getText();
        float price = Float.valueOf(price_txtfield.getText());
        int stock = Integer.parseInt(stock_txtfield1.getText());
        Category category = (Category) category_combobox.getSelectedItem();
        boolean isFavorite = isAvailable_checkbox.isSelected();
        String warnaData = warna.getText();

        Product p = new Product(id, name, price, stock, category, isFavorite,warnaData);        
        productController.manipulate(p,CrudState.UPDATE);
        resetForm();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void id_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtfieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int id = Integer.parseInt(id_txtfield.getText());
        String name = name_txtfield.getText();
        float price = Float.valueOf(price_txtfield.getText());
        int stock = Integer.parseInt(stock_txtfield1.getText());
        Category category = (Category) category_combobox.getSelectedItem();
        boolean isFavorite = isAvailable_checkbox.isSelected();
        String warnaData = warna.getText();

        Product p = new Product(id, name, price, stock, category, isFavorite,warnaData);        
        productController.manipulate(p,CrudState.DELETE);
        resetForm();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void price_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_txtfieldActionPerformed

    private void isAvailable_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAvailable_checkboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isAvailable_checkboxActionPerformed

    @Override
    public void update(Observable o, Object arg) {
        if (o==productController){
            if (arg==null){
                JOptionPane.showMessageDialog(this, "Produk gagal diperbaharui karena kegagalan koneksi ke database");
            }else{            
                Product p = (Product) arg;
                if (productController.getCrudState() == CrudState.INSERT){
                    JOptionPane.showMessageDialog(this, p.getName()+" berhasil ditambahkan");
                }
                setProductTable(productController.getAllProduct());
                resetForm(); 
            }            
        }
    }
    
    
    private String getFormattedPrice(Float value){
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.getDefault());
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();

        symbols.setGroupingSeparator('.');
        symbols.setMonetaryDecimalSeparator(',');
        formatter.setDecimalFormatSymbols(symbols);
        return "Rp "+formatter.format(value);        
        
//        return NumberFormat.getIntegerInstance(getLocale()).format(value);
    }
    
    private String valueAvailableProduk(Boolean isAvailable){
        if(isAvailable){
            return "Ya";
        }else{
            return "Tidak";
        }
    }
    
    private void resetForm(){
        id_txtfield.setText(null);
        name_txtfield.setText(null);
        price_txtfield.setText(null);
        stock_txtfield1.setText(null);
        isAvailable_checkbox.setSelected(false);
        updateBtn.setEnabled(false);
        save_button.setEnabled(true);
        deleteBtn.setEnabled(false);
        warna.setText("");

    }

    private void setProductTable(List<Product> listProduct) {
        if (listProduct==null){
            JOptionPane.showMessageDialog(this, "Data produk gagal diambil dari database","DATABASE FAILED",JOptionPane.ERROR_MESSAGE);
        }else{
            tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
                new String[] {
                    "ID",
                    "Merk Produk",
                    "Harga",
                    "Stok",
                    "Kategori",
                    "Tersedia",
                    "Warna"
                }
            );

            for (Product p : listProduct) {
                Object[] o = new Object[7];
                o[0] = p.getId();
                o[1] = p.getName();
                o[2] = p.getPrice();
                o[3] = p.getStock();
                o[4] = p.getWarna();
                o[5] = valueAvailableProduk(p.getIsAvailable());
                o[6] = p.getCategory().getName();
                

                tableModel.addRow(o);
            }
            
            product_table.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS );
            product_table.setModel(tableModel);
            product_table.getColumnModel().getColumn(0).setMinWidth(5);
            product_table.getColumnModel().getColumn(1).setMinWidth(95);
            product_table.getColumnModel().getColumn(2).setMaxWidth(95);
            product_table.getColumnModel().getColumn(3).setMaxWidth(50);

        }
    }
    
    void tblKeForm(){
        id_txtfield.setText(tableModel.getValueAt(product_table.getSelectedRow(),0)+"");
        name_txtfield.setText(tableModel.getValueAt(product_table.getSelectedRow(),1)+"");
        price_txtfield.setText(tableModel.getValueAt(product_table.getSelectedRow(),2)+"");
        stock_txtfield1.setText(tableModel.getValueAt(product_table.getSelectedRow(),3)+"");
        updateBtn.setEnabled(true);
        save_button.setEnabled(false);
        deleteBtn.setEnabled(true);
        String dataStringIsFavorite = (String) tableModel.getValueAt(product_table.getSelectedRow(),5);
        warna.setText(tableModel.getValueAt(product_table.getSelectedRow(),6)+"");
        boolean isFavoriteData = setAvailableBoolean(dataStringIsFavorite);
        isAvailable_checkbox.setSelected(isFavoriteData);

    }
    
    private boolean setAvailableBoolean(String available){
        if("Ya".equals(available)){
            return true;
        }else{
           return false;
        }
    }
        
    private void setCategory(List<Category> categories){    
        if (categories==null){
            JOptionPane.showMessageDialog(this, "Data kategori gagal diambil dari database","DATABASE FAILED",JOptionPane.ERROR_MESSAGE);
        }else{
            category_combobox.setModel(new DefaultComboBoxModel(categories.toArray()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox category_combobox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField id_txtfield;
    private javax.swing.JCheckBox isAvailable_checkbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name_txtfield;
    private javax.swing.JTextField price_txtfield;
    private javax.swing.JTable product_table;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField stock_txtfield1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField warna;
    // End of variables declaration//GEN-END:variables

}

package CapaUsuario;

import CapaNegocio.Categoria;
import CapaNegocio.Categorias;
import CapaNegocio.Composicion;
import CapaNegocio.Insumo;
import CapaNegocio.Insumos;
import CapaNegocio.Producto;
import CapaNegocio.Productos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ProductoP extends javax.swing.JPanel {
    //Variables usadas para guardar datos a mostrar en pantalla
    LinkedList<Object[]> datosTabla = new LinkedList<Object[]>();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    Producto producto = new Producto();
    Composicion composicion = new Composicion();
    boolean bandModificar = false;
    boolean bandVer = false;
    LinkedList<Composicion> composicionProd;
    
    
    public ProductoP() {
        initComponents();
        
        //Crea las columnas del JTable
        modeloTabla.addColumn("IdInsumo");
        modeloTabla.addColumn("Insumo");
        modeloTabla.addColumn("Cantidad");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        cbxInsumo = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInsumos = new javax.swing.JTable();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(800, 580));
        setMinimumSize(new java.awt.Dimension(800, 580));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setText("Producto");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Descripción");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Categoría");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Cantidad");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Insumo");
        jLabel7.setToolTipText("");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        cbxCategoria.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        cbxInsumo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jtInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdInsumo", "Insumo", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtInsumos.setColumnSelectionAllowed(true);
        jtInsumos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtInsumos);
        jtInsumos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtPrecio.setText("0");
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtCantidad.setText("1");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbxInsumo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(59, 59, 59)
                                    .addComponent(txtNombre))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(164, 164, 164)
                                    .addComponent(jLabel6))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDescripcion)
                                        .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPrecio)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        if(bandVer){
            txtNombre.setEnabled(true);
            txtDescripcion.setEnabled(true);
            cbxCategoria.setEnabled(true);
            txtPrecio.setEnabled(true);
            cbxInsumo.setEnabled(true);
            txtCantidad.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnGuardar.setEnabled(true);
        }
        
        Inicio.limpiarTodo();
        Inicio.listProd.actualizarPantalla();
        Inicio.mostrarVentana(Inicio.listProd);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if((Integer)cbxCategoria.getSelectedIndex() == -1){
            Mensajes.msjError("No hay categorias cargadas en el sistema.");
        }else{
            Categoria cat = (Categoria)cbxCategoria.getSelectedItem();
            //Cuando es un producto nuevo guardara los datos de producto mas la lista de composiciones
            //Cuando es una modificacion solo guardara los datos del producto, las composiciones se guardan al agregarlas
            if(!bandModificar){
                producto = new Producto(txtNombre.getText(), txtDescripcion.getText(), cat.getIdCategoria(), Float.parseFloat(txtPrecio.getText()));
            
                producto.guardarProducto(composicionProd);
            }else{
                producto = new Producto(producto.getIdProd(), txtNombre.getText(), txtDescripcion.getText(), cat.getIdCategoria(), Float.parseFloat(txtPrecio.getText()));
            
                producto.modificarProducto();
            }
        
            Inicio.limpiarTodo();
            Inicio.listProd.actualizarPantalla();
            Inicio.mostrarVentana(Inicio.listProd);
        }
        
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        //Utiliza el numero de row para verificar que haya un elemento seleccionado
        int row = jtInsumos.getSelectedRow();
        if(row == -1){
            Mensajes.msjError("No hay insumos cargados o no selecciono uno.");
        }else{
            if(!bandModificar){
                composicionProd.remove(row);
            }else{
                Producto.eliminarComposicion(producto.getIdProd(), (Integer)jtInsumos.getValueAt(row, 0));
            }
        
            cargarJTB();
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        Insumo  ins = new Insumo();
        ins = (Insumo)cbxInsumo.getSelectedItem();
        //Cuando es un producto nuevo almacena la compocision en un LinkedList que sera guardado junto con el producto
        //Cuando es una modificacion de producto la comipicision sera guardada directamente en base de datos
        if(!bandModificar){    
            composicion = new Composicion(ins.getIdInsumo(), ins.getNombre(), Integer.parseInt(txtCantidad.getText()));
            
            composicionProd.add(composicion);
            
        }else{
            composicion = new Composicion(producto.getIdProd(), ins.getIdInsumo(), ins.getNombre(), Integer.parseInt(txtCantidad.getText()));
            
            Producto.guardarComposicion(composicion);
        }
        
        cargarJTB();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        //Solo permite el ingreso de numeros enteros en el campo cantidad
        txtCantidad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!((c >= '0') && (c <= '9') ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
            }
            }
        });
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed
       //Solo permite el ingreso de numeros en el campo precio
        txtPrecio.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!((c >= '0') && (c <= '9') || !(c != '.') ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
            }
            }
        });
    }//GEN-LAST:event_txtPrecioKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Categoria> cbxCategoria;
    private javax.swing.JComboBox<Insumo> cbxInsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtInsumos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
    //Limpia campos de ingreso de datos y resetea banderas
    public void clear(){
        bandModificar = false;
        bandVer = false;
        producto = new Producto();
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("0");
        txtCantidad.setText("1");
        composicionProd = new LinkedList();
    }
    
    //Limpia toda la pantalla
    public void clear_T(){
        clear();
        
        vaciarTabla();
    }
    
    //Vacia el JTable
    public void vaciarTabla(){
        DefaultTableModel dtm = (DefaultTableModel) jtInsumos.getModel();
        dtm.setRowCount(0);
        jtInsumos.setModel(dtm);
        
        datosTabla.clear();
    }
    
    //Carga JComboBox con datos
    public void cargarCBX(){
        cbxCategoria.removeAll();
        
        LinkedList<Categoria> listaCategorias = new LinkedList();
        
        Categorias.cargarCBXCategoria(listaCategorias);
        
        DefaultComboBoxModel<Categoria> comboModelC = new DefaultComboBoxModel(listaCategorias.toArray());
        
        cbxCategoria.setModel(comboModelC);
        
        cbxInsumo.removeAll();
        
        LinkedList<Insumo> listaInsumos = new LinkedList(); 
        
        Insumos.cargarCBXInsumos(listaInsumos);
        
        DefaultComboBoxModel<Insumo> comboModelI = new DefaultComboBoxModel(listaInsumos.toArray());
        
        cbxInsumo.setModel(comboModelI);
    }
    
    //Carga JTable con datos
    public void cargarJTB(){
        vaciarTabla();
        //Cuando es un producto nuevo carga la tabla desde la variable LinkedList almacenada en esta clase
        //Cuando es una modificacion carga la tabla directo desde base de datos
        if(bandModificar || bandVer){
            Productos.cargarTablaComposiciones(producto.getIdProd(), datosTabla);
            
            ManejoTablas.cargarTabla(datosTabla, modeloTabla);
        }else{
            for(Composicion composicion : composicionProd){
                modeloTabla.addRow(new Object[]{composicion.getIdInsumo(), composicion.getNombreIns(), (Integer)composicion.getCantidad()});
            }
        }               
        
        jtInsumos.setModel(modeloTabla);
    }
    
    //Carga los campos con los datos de un producto parametro. Usado para modificacion
    public void cargarProductoMod(Producto prod){
        bandModificar = true;
        producto = prod;
        Categoria cat = new Categoria();
        cat = Categoria.traerUnaCategoria(prod.getIdCategoria());
        
        cargarJTB();
        
        txtNombre.setText(prod.getNombre());
        txtDescripcion.setText(prod.getDescProd());
        cbxCategoria.setSelectedItem(cat);
        txtPrecio.setText(String.valueOf(prod.getPrecioVenta()));
    }
    
    //Carga los campos con los datos de un producto parametro. Usado para ver producto
    public void cargarProductoVer(Producto prod){
        bandVer = true;
        producto = prod;
        Categoria cat = new Categoria();
        cat = Categoria.traerUnaCategoria(prod.getIdCategoria());
        
        cargarJTB();
        
        txtNombre.setText(prod.getNombre());
        txtDescripcion.setText(prod.getDescProd());
        cbxCategoria.setSelectedItem(cat);
        txtPrecio.setText(String.valueOf(prod.getPrecioVenta()));
        
        //Desactiva la carga de datos porque la funcion es solo para ver la informacion del producto
        txtNombre.setEnabled(false);
        txtDescripcion.setEnabled(false);
        cbxCategoria.setEnabled(false);
        txtPrecio.setEnabled(false);
        cbxInsumo.setEnabled(false);
        txtCantidad.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
    }
    
    //Actualiza la pantalla
    public void actualizarPantalla(){
        cargarCBX();
    }
}

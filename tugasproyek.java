package tugas.proyekk;



public class tugasproyek extends javax.swing.JFrame {





    public tugasproyek() {

        initComponents();

    }



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

        jLabel8 = new javax.swing.JLabel();

        jLabel9 = new javax.swing.JLabel();

        txtgaji = new javax.swing.JTextField();

        TxtNama = new javax.swing.JTextField();

        TxtNip = new javax.swing.JTextField();

        txtlembur = new javax.swing.JTextField();

        cmbjk = new javax.swing.JComboBox<>();

        cmbjamkerja = new javax.swing.JComboBox<>();

        cmbjabatan = new javax.swing.JComboBox<>();

        btnhitung = new javax.swing.JButton();

        btnkeluar = new javax.swing.JButton();

        txttotal = new javax.swing.JTextField();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        jLabel1.setText("Gaji Pegawai");



        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel2.setText("Nip");



        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel3.setText("Nama Pegawai");



        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel4.setText("Jabatan");



        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel5.setText("Jenis Kelamin");



        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel6.setText("Gaji");



        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel7.setText("Jam Kerja");



        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel8.setText("Lembur");



        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel9.setText("Total Gaji");



        txtgaji.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                txtgajiActionPerformed(evt);

            }

        });



        txtlembur.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                txtlemburActionPerformed(evt);

            }

        });



        cmbjk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki-Laki", "Perempuan", "" }));

        cmbjk.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                cmbjkActionPerformed(evt);

            }

        });



        cmbjamkerja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jam", "1 Jam", "2 Jam", "3 Jam", "4 Jam", "5 Jam" }));

        cmbjamkerja.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                cmbjamkerjaActionPerformed(evt);

            }

        });



        cmbjabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jabatan", "Manager", "Customer Service", "Cleaning Service" }));

        cmbjabatan.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                cmbjabatanActionPerformed(evt);

            }

        });



        btnhitung.setText("Hitung");

        btnhitung.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btnhitungActionPerformed(evt);

            }

        });



        btnkeluar.setText("Keluar");

        btnkeluar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btnkeluarActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addGap(176, 176, 176)

                .addComponent(btnkeluar)

                .addGap(0, 0, Short.MAX_VALUE))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                .addContainerGap(22, Short.MAX_VALUE)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(jLabel3)

                            .addComponent(jLabel2)

                            .addComponent(jLabel4)

                            .addComponent(jLabel5)

                            .addComponent(jLabel6)

                            .addComponent(jLabel7)

                            .addComponent(jLabel8)

                            .addComponent(jLabel9))

                        .addGap(18, 18, 18)

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(cmbjamkerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(btnhitung)

                            .addComponent(cmbjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(cmbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(TxtNip, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)

                                .addComponent(txttotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)

                                .addComponent(txtlembur, javax.swing.GroupLayout.Alignment.LEADING)

                                .addComponent(txtgaji, javax.swing.GroupLayout.Alignment.LEADING)))

                        .addGap(192, 192, 192))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(139, 139, 139))))

        );

        layout.setVerticalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addGap(4, 4, 4)

                .addComponent(jLabel1)

                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(TxtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel2))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel3))

                .addGap(26, 26, 26)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(cmbjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel5))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(cmbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel4))

                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(txtgaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel6))

                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(cmbjamkerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel7))

                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(txtlembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel8))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                .addComponent(btnhitung)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))

                .addGap(27, 27, 27)

                .addComponent(btnkeluar)

                .addContainerGap())

        );



        pack();

    }// </editor-fold>

    private void txtgajiActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void cmbjkActionPerformed(java.awt.event.ActionEvent evt) {

       
        } if (cmbjk.getSelectedItem(). equals ("Laki-Laki")) 

        {

        } else if (cmbjk.getSelectedItem(). equals ("Perempuan")) {

              }

    }

    private void cmbjabatanActionPerformed(java.awt.event.ActionEvent evt){ 

            if (cmbjabatan.getSelectedItem().equals ("Pilih")) {

            txtgaji.setText (" ");

        }

        else if (cmbjabatan.getSelectedItem().equals ("Manager")) {

            txtgaji.setText ("3000000");

        }
 	else if (cmbjabatan.getSelectedItem().equals ("personalia")) {

            txtgaji.setText ("3000000");

        }

         else if (cmbjabatan.getSelectedItem().equals ("Customer Service")) {

            txtgaji.setText ("2500000");

        }

         else if (cmbjabatan.getSelectedItem().equals ("Security")) {

            txtgaji.setText ("1000000");

        }

    }



    private void txtlemburActionPerformed(java.awt.event.ActionEvent evt) {

    }



    private void cmbjamkerjaActionPerformed(java.awt.event.ActionEvent evt) {

        if (cmbjamkerja.getSelectedItem(). equals ("Pilih")){

            txtlembur.setText(" ");

        }

        else if (cmbjamkerja.getSelectedItem(). equals ("6 jam")){

            txtlembur.setText("500000");

        }

        else if (cmbjamkerja.getSelectedItem(). equals ("8 jam")){

            txtlembur.setText("750000");

        }

        else if (cmbjamkerja.getSelectedItem(). equals ("10 jam")){

            txtlembur.setText("1000000");

        }


    }



    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {

            int x = Integer.parseInt(txtgaji.getText());

            int y = Integer.parseInt(txtlembur.getText());

            int z = x+y;

            txttotal.setText(String.valueOf(z));

            

            

    }



    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {

        dispose;

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JTextField TxtNama;

    private javax.swing.JTextField TxtNip;

    private javax.swing.JButton btnhitung;

    private javax.swing.JButton btnkeluar;

    private javax.swing.JComboBox<String> cmbjabatan;

    private javax.swing.JComboBox<String> cmbjamkerja;

    private javax.swing.JComboBox<String> cmbjk;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JTextField txtgaji;

    private javax.swing.JTextField txtlembur;

    private javax.swing.JTextField txttotal;

    // End of variables declaration//GEN-END:variables

}
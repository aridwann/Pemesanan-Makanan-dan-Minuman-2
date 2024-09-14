package uaspbo2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;

public class Menu extends javax.swing.JFrame {
    private String[] namaMakanan = {
        "Nasi Goreng Spesial",
        "Kwetiaw Spesial",
        "Sate Aci",
        "Mie Goreng Spesial",
    };
    private String[] deskripsiMakanan = {
        "Nasi Goreng Kecap dengan Toping Lengkap",
        "Kwetiaw dengan Toping Lengkap",
        "Sate Aci dengan Saus Kacang",
        "Mie Pedas dengan Toping Lengkap",
    };
    private int[] hargaMakanan = {
        12000, 
        21000, 
        15000, 
        20000,
    };
    
    private String input = "";
    
    private int count_1 = 0;
    private int count_2 = 0;
    private int count_3 = 0;
    private int count_4 = 0;
    
    private int subTotal_1 = 0;
    private int subTotal_2 = 0;
    private int subTotal_3 = 0;
    private int subTotal_4 = 0;
    
    private int item(){
        int count = 0;

        if (count_1 != 0) {
          count++;
        }

        if (count_2 != 0) {
          count++;
        }

        if (count_3 != 0) {
          count++;
        }

        if (count_4 != 0) {
          count++;
        }

        return count;
    }
    
    private void isBtnEnable(){
        if(item() != 0){
            btnBayar.setEnabled(true);
            btnBayar.setFocusPainted(true);
        }else{
            btnBayar.setEnabled(false);
            btnBayar.setFocusPainted(true);
        }
    }
    
    private String getCurrentDate() {
      SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
      Date date_ = new Date();
      return formatter.format(date_);
    }
    
    private String getTotalPrice(){
        int total = subTotal_1 + subTotal_2 + subTotal_3 + subTotal_4;
        return "Rp. " + total;
    }
    
    private void search(){
        menuItem1.setVisible(false);
        menuItem2.setVisible(false);
        menuItem3.setVisible(false);
        menuItem4.setVisible(false);
        
        String j = "";
        for(int i = 0; i < namaMakanan.length; i++){
            if(!input.equals("")){
                if(namaMakanan[i].toLowerCase().contains(input.toLowerCase())){
                    j += i;
                }
            }else{
                j = "";
            }
        }
        
        switch (j) {
            case "0":
                menuItem1.setVisible(true);
                break;            
            case "1":
                menuItem2.setVisible(true);
                break;
            case "2":
                menuItem3.setVisible(true);
                break;
            case "3":
                menuItem4.setVisible(true);
                break;
            case "01":
                menuItem1.setVisible(true);
                menuItem2.setVisible(true);
                break;
            case "02":
                menuItem1.setVisible(true);
                menuItem3.setVisible(true);
                break;
            case "03":
                menuItem1.setVisible(true);
                menuItem4.setVisible(true);
                break;
            case "12":
                menuItem2.setVisible(true);
                menuItem3.setVisible(true);
                break;
            case "13":
                menuItem2.setVisible(true);
                menuItem4.setVisible(true);
                break;
            case "23":
                menuItem3.setVisible(true);
                menuItem4.setVisible(true);
                break;
            case "012":
                menuItem1.setVisible(true);
                menuItem2.setVisible(true);
                menuItem3.setVisible(true);
                break;
            case "013":
                menuItem1.setVisible(true);
                menuItem2.setVisible(true);
                menuItem4.setVisible(true);
                break;
            case "023":
                menuItem1.setVisible(true);
                menuItem3.setVisible(true);
                menuItem4.setVisible(true);
                break;
            case "1234":
                menuItem1.setVisible(true);
                menuItem2.setVisible(true);
                menuItem3.setVisible(true);
                menuItem4.setVisible(true);
                break;
            default:
                menuItem1.setVisible(true);
                menuItem2.setVisible(true);
                menuItem3.setVisible(true);
                menuItem4.setVisible(true);
        }
    }
  
    
    public Menu() {
        initComponents();
        
        name1.setText(namaMakanan[0]);
        name2.setText(namaMakanan[1]);
        name3.setText(namaMakanan[2]);
        name4.setText(namaMakanan[3]);
        
        namaOrder1.setText(namaMakanan[0]);
        namaOrder2.setText(namaMakanan[1]);
        namaOrder3.setText(namaMakanan[2]);
        namaOrder4.setText(namaMakanan[3]);
        
        desc1.setText(deskripsiMakanan[0]);
        desc2.setText(deskripsiMakanan[1]);
        desc3.setText(deskripsiMakanan[2]);
        desc4.setText(deskripsiMakanan[3]);
        
        price1.setText("Rp. "+hargaMakanan[0]);
        price2.setText("Rp. "+hargaMakanan[1]);
        price3.setText("Rp. "+hargaMakanan[2]);
        price4.setText("Rp. "+hargaMakanan[3]);
        
        date.setText(getCurrentDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContainer = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        detailContainer = new javax.swing.JPanel();
        panel1 = new custom.Panel();
        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        namaOrder1 = new javax.swing.JLabel();
        countOrder1 = new javax.swing.JLabel();
        subTotal1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        namaOrder2 = new javax.swing.JLabel();
        countOrder2 = new javax.swing.JLabel();
        subTotal2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        namaOrder3 = new javax.swing.JLabel();
        countOrder3 = new javax.swing.JLabel();
        subTotal3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        namaOrder4 = new javax.swing.JLabel();
        countOrder4 = new javax.swing.JLabel();
        subTotal4 = new javax.swing.JLabel();
        panel7 = new custom.Panel();
        jumlahItem = new javax.swing.JLabel();
        totalOrder = new javax.swing.JLabel();
        btnBayar = new custom.Button();
        title1 = new javax.swing.JLabel();
        menuItem1 = new custom.Panel();
        pict1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        btnMin1 = new javax.swing.JLabel();
        count1 = new javax.swing.JLabel();
        btnPlus1 = new javax.swing.JLabel();
        desc1 = new javax.swing.JTextArea();
        menuItem2 = new custom.Panel();
        pict2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        btnMin2 = new javax.swing.JLabel();
        count2 = new javax.swing.JLabel();
        btnPlus2 = new javax.swing.JLabel();
        desc2 = new javax.swing.JTextArea();
        menuItem3 = new custom.Panel();
        pict3 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        btnMin3 = new javax.swing.JLabel();
        count3 = new javax.swing.JLabel();
        btnPlus3 = new javax.swing.JLabel();
        desc3 = new javax.swing.JTextArea();
        menuItem4 = new custom.Panel();
        pict4 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        btnMin4 = new javax.swing.JLabel();
        count4 = new javax.swing.JLabel();
        btnPlus4 = new javax.swing.JLabel();
        desc4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 832));

        mainContainer.setBackground(new java.awt.Color(61, 70, 78));
        mainContainer.setPreferredSize(new java.awt.Dimension(1280, 832));

        searchBar.setBackground(new java.awt.Color(54, 62, 72));
        searchBar.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        searchBar.setForeground(new java.awt.Color(116, 125, 132));
        searchBar.setText("Cari Menu");
        searchBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        searchBar.setFocusAccelerator('0');
        searchBar.setRequestFocusEnabled(false);
        searchBar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchBarCaretUpdate(evt);
            }
        });
        searchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBarFocusGained(evt);
            }
        });

        detailContainer.setBackground(new java.awt.Color(61, 70, 78));
        detailContainer.setPreferredSize(new java.awt.Dimension(600, 724));

        panel1.setBackground(new java.awt.Color(54, 62, 72));
        panel1.setRoundTopLeft(15);
        panel1.setRoundTopRight(15);

        title.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(194, 215, 240));
        title.setText("Kelompok 3");

        date.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(194, 215, 240));
        date.setText("11 September 2004");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(217, 217, 217));
        jTextField1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(54, 62, 72));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("3");
        jTextField1.setDisabledTextColor(new java.awt.Color(54, 62, 72));
        jTextField1.setEnabled(false);
        jTextField1.setMinimumSize(new java.awt.Dimension(50, 36));
        jTextField1.setPreferredSize(new java.awt.Dimension(50, 36));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date)
                    .addComponent(title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(54, 62, 72));

        title3.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        title3.setForeground(new java.awt.Color(194, 215, 240));
        title3.setText("Daftar Pesanan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(title3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(54, 62, 72));

        namaOrder1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        namaOrder1.setForeground(new java.awt.Color(194, 215, 240));
        namaOrder1.setText("Nama Makanan 1");

        countOrder1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        countOrder1.setForeground(new java.awt.Color(194, 215, 240));
        countOrder1.setText("x0");

        subTotal1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        subTotal1.setForeground(new java.awt.Color(194, 215, 240));
        subTotal1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subTotal1.setText("Rp. 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subTotal1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(namaOrder1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countOrder1)))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaOrder1)
                    .addComponent(countOrder1))
                .addGap(15, 15, 15)
                .addComponent(subTotal1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(54, 62, 72));

        namaOrder2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        namaOrder2.setForeground(new java.awt.Color(194, 215, 240));
        namaOrder2.setText("Nama Makanan 1");

        countOrder2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        countOrder2.setForeground(new java.awt.Color(194, 215, 240));
        countOrder2.setText("x0");

        subTotal2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        subTotal2.setForeground(new java.awt.Color(194, 215, 240));
        subTotal2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subTotal2.setText("Rp. 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subTotal2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(namaOrder2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countOrder2)))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaOrder2)
                    .addComponent(countOrder2))
                .addGap(15, 15, 15)
                .addComponent(subTotal2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(54, 62, 72));

        namaOrder3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        namaOrder3.setForeground(new java.awt.Color(194, 215, 240));
        namaOrder3.setText("Nama Makanan 1");

        countOrder3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        countOrder3.setForeground(new java.awt.Color(194, 215, 240));
        countOrder3.setText("x0");

        subTotal3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        subTotal3.setForeground(new java.awt.Color(194, 215, 240));
        subTotal3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subTotal3.setText("Rp. 0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subTotal3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(namaOrder3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countOrder3)))
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaOrder3)
                    .addComponent(countOrder3))
                .addGap(15, 15, 15)
                .addComponent(subTotal3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(54, 62, 72));

        namaOrder4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        namaOrder4.setForeground(new java.awt.Color(194, 215, 240));
        namaOrder4.setText("Nama Makanan 1");

        countOrder4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        countOrder4.setForeground(new java.awt.Color(194, 215, 240));
        countOrder4.setText("x0");

        subTotal4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        subTotal4.setForeground(new java.awt.Color(194, 215, 240));
        subTotal4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subTotal4.setText("Rp. 0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subTotal4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(namaOrder4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countOrder4)))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaOrder4)
                    .addComponent(countOrder4))
                .addGap(15, 15, 15)
                .addComponent(subTotal4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panel7.setBackground(new java.awt.Color(54, 62, 72));
        panel7.setRoundBottomLeft(15);
        panel7.setRoundBottomRight(15);

        jumlahItem.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jumlahItem.setForeground(new java.awt.Color(194, 215, 240));
        jumlahItem.setText("Jumlah Item (0)");

        totalOrder.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        totalOrder.setForeground(new java.awt.Color(194, 215, 240));
        totalOrder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalOrder.setText("Rp. 0");

        btnBayar.setBackground(new java.awt.Color(17, 100, 202));
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.setBorderColor(new java.awt.Color(54, 62, 72));
        btnBayar.setEnabled(false);
        btnBayar.setFocusPainted(false);
        btnBayar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnBayar.setRadius(15);
        btnBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBayarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addComponent(jumlahItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalOrder)))
                .addGap(30, 30, 30))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahItem)
                    .addComponent(totalOrder))
                .addGap(15, 15, 15)
                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout detailContainerLayout = new javax.swing.GroupLayout(detailContainer);
        detailContainer.setLayout(detailContainerLayout);
        detailContainerLayout.setHorizontalGroup(
            detailContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        detailContainerLayout.setVerticalGroup(
            detailContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailContainerLayout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        title1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(229, 234, 239));
        title1.setText("Pilih Menu");

        menuItem1.setBackground(new java.awt.Color(54, 62, 72));
        menuItem1.setPreferredSize(new java.awt.Dimension(300, 320));
        menuItem1.setRoundBottomLeft(15);
        menuItem1.setRoundBottomRight(15);
        menuItem1.setRoundTopLeft(15);
        menuItem1.setRoundTopRight(15);

        pict1.setBackground(new java.awt.Color(255, 255, 255));
        pict1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/nasi goreng.jpg"))); // NOI18N
        pict1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        name1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("Nama");

        price1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        price1.setForeground(new java.awt.Color(255, 255, 255));
        price1.setText("Rp. 0");

        btnMin1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnMin1.setForeground(new java.awt.Color(255, 255, 255));
        btnMin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/min-ico.png"))); // NOI18N
        btnMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMin1MouseClicked(evt);
            }
        });

        count1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        count1.setForeground(new java.awt.Color(255, 255, 255));
        count1.setText("0");

        btnPlus1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnPlus1.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-ico.png"))); // NOI18N
        btnPlus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlus1MouseClicked(evt);
            }
        });

        desc1.setEditable(false);
        desc1.setBackground(new java.awt.Color(54, 62, 72));
        desc1.setColumns(10);
        desc1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        desc1.setForeground(new java.awt.Color(242, 242, 242));
        desc1.setRows(2);
        desc1.setText("Deskripsi");
        desc1.setBorder(null);

        javax.swing.GroupLayout menuItem1Layout = new javax.swing.GroupLayout(menuItem1);
        menuItem1.setLayout(menuItem1Layout);
        menuItem1Layout.setHorizontalGroup(
            menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(menuItem1Layout.createSequentialGroup()
                            .addComponent(price1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMin1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(count1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPlus1))
                        .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pict1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuItem1Layout.setVerticalGroup(
            menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(pict1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem1Layout.createSequentialGroup()
                        .addComponent(price1)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuItem1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(count1))
                        .addComponent(btnPlus1)
                        .addComponent(btnMin1)))
                .addGap(19, 19, 19))
        );

        menuItem2.setBackground(new java.awt.Color(54, 62, 72));
        menuItem2.setPreferredSize(new java.awt.Dimension(300, 320));
        menuItem2.setRoundBottomLeft(15);
        menuItem2.setRoundBottomRight(15);
        menuItem2.setRoundTopLeft(15);
        menuItem2.setRoundTopRight(15);

        pict2.setBackground(new java.awt.Color(255, 255, 255));
        pict2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/kwetiaw goreng.jpg"))); // NOI18N
        pict2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        name2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setText("Nama");

        price2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        price2.setForeground(new java.awt.Color(255, 255, 255));
        price2.setText("Rp. 0");

        btnMin2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnMin2.setForeground(new java.awt.Color(255, 255, 255));
        btnMin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/min-ico.png"))); // NOI18N
        btnMin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMin2MouseClicked(evt);
            }
        });

        count2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        count2.setForeground(new java.awt.Color(255, 255, 255));
        count2.setText("0");

        btnPlus2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnPlus2.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-ico.png"))); // NOI18N
        btnPlus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlus2MouseClicked(evt);
            }
        });

        desc2.setEditable(false);
        desc2.setBackground(new java.awt.Color(54, 62, 72));
        desc2.setColumns(10);
        desc2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        desc2.setForeground(new java.awt.Color(242, 242, 242));
        desc2.setRows(2);
        desc2.setText("Deskripsi");
        desc2.setBorder(null);

        javax.swing.GroupLayout menuItem2Layout = new javax.swing.GroupLayout(menuItem2);
        menuItem2.setLayout(menuItem2Layout);
        menuItem2Layout.setHorizontalGroup(
            menuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(menuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desc2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(menuItem2Layout.createSequentialGroup()
                            .addComponent(price2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMin2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(count2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPlus2))
                        .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pict2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuItem2Layout.setVerticalGroup(
            menuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(pict2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name2)
                .addGap(10, 10, 10)
                .addComponent(desc2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(menuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem2Layout.createSequentialGroup()
                        .addComponent(price2)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuItem2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(count2))
                        .addComponent(btnPlus2)
                        .addComponent(btnMin2)))
                .addGap(19, 19, 19))
        );

        menuItem3.setBackground(new java.awt.Color(54, 62, 72));
        menuItem3.setPreferredSize(new java.awt.Dimension(300, 320));
        menuItem3.setRoundBottomLeft(15);
        menuItem3.setRoundBottomRight(15);
        menuItem3.setRoundTopLeft(15);
        menuItem3.setRoundTopRight(15);

        pict3.setBackground(new java.awt.Color(255, 255, 255));
        pict3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/sate aci.jpg"))); // NOI18N
        pict3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        name3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setText("Nama");

        price3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        price3.setForeground(new java.awt.Color(255, 255, 255));
        price3.setText("Rp. 0");

        btnMin3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnMin3.setForeground(new java.awt.Color(255, 255, 255));
        btnMin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/min-ico.png"))); // NOI18N
        btnMin3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMin3MouseClicked(evt);
            }
        });

        count3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        count3.setForeground(new java.awt.Color(255, 255, 255));
        count3.setText("0");

        btnPlus3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnPlus3.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-ico.png"))); // NOI18N
        btnPlus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlus3MouseClicked(evt);
            }
        });

        desc3.setEditable(false);
        desc3.setBackground(new java.awt.Color(54, 62, 72));
        desc3.setColumns(10);
        desc3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        desc3.setForeground(new java.awt.Color(242, 242, 242));
        desc3.setRows(2);
        desc3.setText("Deskripsi");
        desc3.setBorder(null);

        javax.swing.GroupLayout menuItem3Layout = new javax.swing.GroupLayout(menuItem3);
        menuItem3.setLayout(menuItem3Layout);
        menuItem3Layout.setHorizontalGroup(
            menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desc3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(menuItem3Layout.createSequentialGroup()
                            .addComponent(price3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMin3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(count3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPlus3))
                        .addComponent(name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pict3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuItem3Layout.setVerticalGroup(
            menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(pict3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name3)
                .addGap(10, 10, 10)
                .addComponent(desc3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem3Layout.createSequentialGroup()
                        .addComponent(price3)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuItem3Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(count3))
                        .addComponent(btnPlus3)
                        .addComponent(btnMin3)))
                .addGap(19, 19, 19))
        );

        menuItem4.setBackground(new java.awt.Color(54, 62, 72));
        menuItem4.setPreferredSize(new java.awt.Dimension(300, 320));
        menuItem4.setRoundBottomLeft(15);
        menuItem4.setRoundBottomRight(15);
        menuItem4.setRoundTopLeft(15);
        menuItem4.setRoundTopRight(15);

        pict4.setBackground(new java.awt.Color(255, 255, 255));
        pict4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/mie goreng.jpg"))); // NOI18N
        pict4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        name4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        name4.setForeground(new java.awt.Color(255, 255, 255));
        name4.setText("Nama");

        price4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        price4.setForeground(new java.awt.Color(255, 255, 255));
        price4.setText("Rp. 0");

        btnMin4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnMin4.setForeground(new java.awt.Color(255, 255, 255));
        btnMin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/min-ico.png"))); // NOI18N
        btnMin4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMin4MouseClicked(evt);
            }
        });

        count4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        count4.setForeground(new java.awt.Color(255, 255, 255));
        count4.setText("0");

        btnPlus4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnPlus4.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-ico.png"))); // NOI18N
        btnPlus4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlus4MouseClicked(evt);
            }
        });

        desc4.setEditable(false);
        desc4.setBackground(new java.awt.Color(54, 62, 72));
        desc4.setColumns(10);
        desc4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        desc4.setForeground(new java.awt.Color(242, 242, 242));
        desc4.setRows(2);
        desc4.setText("Deskripsi");
        desc4.setBorder(null);

        javax.swing.GroupLayout menuItem4Layout = new javax.swing.GroupLayout(menuItem4);
        menuItem4.setLayout(menuItem4Layout);
        menuItem4Layout.setHorizontalGroup(
            menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desc4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(menuItem4Layout.createSequentialGroup()
                            .addComponent(price4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMin4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(count4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPlus4))
                        .addComponent(name4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pict4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuItem4Layout.setVerticalGroup(
            menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(pict4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name4)
                .addGap(10, 10, 10)
                .addComponent(desc4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem4Layout.createSequentialGroup()
                        .addComponent(price4)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuItem4Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(count4))
                        .addComponent(btnPlus4)
                        .addComponent(btnMin4)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout mainContainerLayout = new javax.swing.GroupLayout(mainContainer);
        mainContainer.setLayout(mainContainerLayout);
        mainContainerLayout.setHorizontalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainContainerLayout.createSequentialGroup()
                        .addComponent(title1)
                        .addGap(43, 43, 43)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainContainerLayout.createSequentialGroup()
                        .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(detailContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        mainContainerLayout.setVerticalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainContainerLayout.createSequentialGroup()
                        .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title1))
                        .addGap(15, 15, 15)
                        .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(detailContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1280, 832));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlus2MouseClicked
        count_2++;
        subTotal_2 = count_2 * hargaMakanan[1];

        count2.setText(""+count_2);
        countOrder2.setText("x"+count_2);
        jumlahItem.setText("Jumlah Item ("+item()+")");
        subTotal2.setText("Rp. " + subTotal_2);
        totalOrder.setText(getTotalPrice());
        isBtnEnable();
    }//GEN-LAST:event_btnPlus2MouseClicked

    private void btnMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMin2MouseClicked
        if(count_2 != 0){
            count_2--;
            subTotal_2 = count_2 * hargaMakanan[1];
        }
        count2.setText(""+count_2);
        countOrder2.setText("x"+count_2);
        jumlahItem.setText("Jumlah Item ("+item()+")");
        subTotal2.setText("Rp. " + subTotal_2);
        totalOrder.setText(getTotalPrice());
        isBtnEnable();
    }//GEN-LAST:event_btnMin2MouseClicked

    private void searchBarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchBarCaretUpdate
        input = searchBar.getText();
        search();
    }//GEN-LAST:event_searchBarCaretUpdate

    private void searchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusGained
        searchBar.setText("");
    }//GEN-LAST:event_searchBarFocusGained

    private void btnMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMin1MouseClicked
        if(count_1 != 0){
            count_1--;
            subTotal_1 = count_1 * hargaMakanan[0];
        }
        count1.setText(""+count_1);
        countOrder1.setText("x"+count_1);
        jumlahItem.setText("Jumlah Item ("+item()+")");
        subTotal1.setText("Rp. " + subTotal_1);
        totalOrder.setText(getTotalPrice());
        isBtnEnable();
    }//GEN-LAST:event_btnMin1MouseClicked

    private void btnPlus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlus1MouseClicked
        count_1++;
        subTotal_1 = count_1 * hargaMakanan[0];

        count1.setText(""+count_1);
        countOrder1.setText("x"+count_1);
        jumlahItem.setText("Jumlah Item ("+item()+")");
        subTotal1.setText("Rp. " + subTotal_1);
        totalOrder.setText(getTotalPrice());
        isBtnEnable();
    }//GEN-LAST:event_btnPlus1MouseClicked

    private void btnMin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMin3MouseClicked
        if(count_3 != 0){
            count_3--;
            subTotal_3 = count_3 * hargaMakanan[2];
        }
        count3.setText(""+count_3);
        countOrder3.setText("x"+count_3);
        jumlahItem.setText("Jumlah Item ("+item()+")");
        subTotal3.setText("Rp. " + subTotal_3);
        totalOrder.setText(getTotalPrice());
        isBtnEnable();
    }//GEN-LAST:event_btnMin3MouseClicked

    private void btnPlus3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlus3MouseClicked
        count_3++;
        subTotal_3 = count_3 * hargaMakanan[2];

        count3.setText(""+count_3);
        countOrder3.setText("x"+count_3);
        jumlahItem.setText("Jumlah Item ("+item()+")");
        subTotal3.setText("Rp. " + subTotal_3);
        totalOrder.setText(getTotalPrice());
        isBtnEnable();
    }//GEN-LAST:event_btnPlus3MouseClicked

    private void btnMin4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMin4MouseClicked
        if(count_4 != 0){
            count_4--;
            subTotal_4 = count_4 * hargaMakanan[3];
        }
        count4.setText(""+count_4);
        countOrder4.setText("x"+count_4);
        jumlahItem.setText("Jumlah Item ("+item()+")");
        subTotal4.setText("Rp. " + subTotal_4);
        totalOrder.setText(getTotalPrice());
        isBtnEnable();
    }//GEN-LAST:event_btnMin4MouseClicked

    private void btnPlus4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlus4MouseClicked
        count_4++;
        subTotal_4 = count_4 * hargaMakanan[3];

        count4.setText(""+count_4);
        countOrder4.setText("x"+count_4);
        jumlahItem.setText("Jumlah Item ("+item()+")");
        subTotal4.setText("Rp. " + subTotal_4);
        totalOrder.setText(getTotalPrice());
        isBtnEnable();
    }//GEN-LAST:event_btnPlus4MouseClicked

    private void btnBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseClicked
        new PopUpBayar(getTotalPrice()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBayarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.Button btnBayar;
    private javax.swing.JLabel btnMin1;
    private javax.swing.JLabel btnMin2;
    private javax.swing.JLabel btnMin3;
    private javax.swing.JLabel btnMin4;
    private javax.swing.JLabel btnPlus1;
    private javax.swing.JLabel btnPlus2;
    private javax.swing.JLabel btnPlus3;
    private javax.swing.JLabel btnPlus4;
    private javax.swing.JLabel count1;
    private javax.swing.JLabel count2;
    private javax.swing.JLabel count3;
    private javax.swing.JLabel count4;
    private javax.swing.JLabel countOrder1;
    private javax.swing.JLabel countOrder2;
    private javax.swing.JLabel countOrder3;
    private javax.swing.JLabel countOrder4;
    private javax.swing.JLabel date;
    private javax.swing.JTextArea desc1;
    private javax.swing.JTextArea desc2;
    private javax.swing.JTextArea desc3;
    private javax.swing.JTextArea desc4;
    private javax.swing.JPanel detailContainer;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jumlahItem;
    private javax.swing.JPanel mainContainer;
    private custom.Panel menuItem1;
    private custom.Panel menuItem2;
    private custom.Panel menuItem3;
    private custom.Panel menuItem4;
    private javax.swing.JLabel namaOrder1;
    private javax.swing.JLabel namaOrder2;
    private javax.swing.JLabel namaOrder3;
    private javax.swing.JLabel namaOrder4;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private custom.Panel panel1;
    private custom.Panel panel7;
    private javax.swing.JLabel pict1;
    private javax.swing.JLabel pict2;
    private javax.swing.JLabel pict3;
    private javax.swing.JLabel pict4;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price4;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel subTotal1;
    private javax.swing.JLabel subTotal2;
    private javax.swing.JLabel subTotal3;
    private javax.swing.JLabel subTotal4;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel totalOrder;
    // End of variables declaration//GEN-END:variables
}

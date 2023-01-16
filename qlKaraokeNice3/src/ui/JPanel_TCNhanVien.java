/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import connect.Connect;
import dao.ChucVu_DAO;
import dao.NhanVien_DAO;
import entity.ChucVu;
import entity.NhanVien;


/**
 *
 * @author dell
 */
public class JPanel_TCNhanVien extends javax.swing.JPanel {
	private NhanVien_DAO nhanVien_DAO;
	private ChucVu_DAO chucVu_DAO;
	private DefaultTableModel model;

    /**
     * Creates new form Panel1
     */
    public JPanel_TCNhanVien() {
        initComponents();
        tblNhanVien.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
        model = (DefaultTableModel) tblNhanVien.getModel();
		try {
			Connect.getInstance().connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		nhanVien_DAO = new NhanVien_DAO();
		chucVu_DAO = new ChucVu_DAO();
		DocDuLieuDatabaseVaoTable();
        loadCBBChucVu(cboChucVu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThongTinTC = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblNgaySinh = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        dchNgaySinh = new com.toedter.calendar.JDateChooser();
        txtDiaChi = new javax.swing.JTextField();
        lblTenNV = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        lblCMND = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        lblChucVu = new javax.swing.JLabel();
        cboChucVu = new javax.swing.JComboBox<>();
        lblGioiTinh = new javax.swing.JLabel();
        cboGioiTinh = new javax.swing.JComboBox<>();
        lblSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        pnlSuKien = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        pnlDanhSachNV = new javax.swing.JPanel();
        scr = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        pnlThongTinTC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Tra Cứu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        pnlThongTinTC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblMaNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMaNV.setText("Mã NV:");

        txtMaNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaNV.setMinimumSize(new java.awt.Dimension(50, 35));


        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNgaySinh.setText("Ngày Sinh:");

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDiaChi.setText("Địa Chỉ:");

        dchNgaySinh.setDateFormatString("dd-MM-yyyy");
        dchNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchNgaySinh.setMinimumSize(new java.awt.Dimension(50, 33));

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDiaChi.setMinimumSize(new java.awt.Dimension(50, 35));

        lblTenNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTenNV.setText("Tên NV:");

        txtTenNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenNV.setMinimumSize(new java.awt.Dimension(50, 35));

        lblCMND.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCMND.setText("Số CMND:");

        txtCMND.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCMND.setMinimumSize(new java.awt.Dimension(50, 35));

        lblChucVu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChucVu.setText("Chức Vụ:");

        cboChucVu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Người Quản Lý", "Nhân Viên Lễ Tân", "Nhân Viên Phục Vụ", "Nhân Viên Bảo Vệ" }));
        cboChucVu.setMinimumSize(new java.awt.Dimension(50, 35));

        lblGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGioiTinh.setText("Giới Tính:");

        cboGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giới Tính", "Nam", "Nữ" }));
        cboGioiTinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboGioiTinh.setMinimumSize(new java.awt.Dimension(50, 35));

        lblSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSDT.setText("Số Điện Thoại:");

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSDT.setMinimumSize(new java.awt.Dimension(50, 35));


        javax.swing.GroupLayout pnlThongTinTCLayout = new javax.swing.GroupLayout(pnlThongTinTC);
        pnlThongTinTC.setLayout(pnlThongTinTCLayout);
        pnlThongTinTCLayout.setHorizontalGroup(
            pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinTCLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboChucVu, 0, 390, Short.MAX_VALUE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(cboGioiTinh, 0, 390, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        pnlThongTinTCLayout.setVerticalGroup(
            pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinTCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlThongTinTCLayout.createSequentialGroup()
                        .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(dchNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinTCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon("icon/TC_icon.png")); // NOI18N
        btnTimKiem.setBackground(new Color(0,191,255));
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon("icon/LamMoi_icon.png")); // NOI18N
        btnLamMoi.setBackground(new Color(0,191,255));
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSuKienLayout = new javax.swing.GroupLayout(pnlSuKien);
        pnlSuKien.setLayout(pnlSuKienLayout);
        pnlSuKienLayout.setHorizontalGroup(
            pnlSuKienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuKienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSuKienLayout.setVerticalGroup(
            pnlSuKienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuKienLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(pnlSuKienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        pnlDanhSachNV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        pnlDanhSachNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tblNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Mã NV", "Tên NV", "Giới Tính", "Ngày Sinh", "Số CMND", "Số ĐT", "Địa Chỉ", "Chức Vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblNhanVien.setRowHeight(30);
        tblNhanVien.getTableHeader().setBackground(new Color(255, 127, 0));
        tblNhanVien.setShowHorizontalLines(true);
        tblNhanVien.setShowVerticalLines(true);
        scr.setViewportView(tblNhanVien);

        javax.swing.GroupLayout pnlDanhSachNVLayout = new javax.swing.GroupLayout(pnlDanhSachNV);
        pnlDanhSachNV.setLayout(pnlDanhSachNVLayout);
        pnlDanhSachNVLayout.setHorizontalGroup(
            pnlDanhSachNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlDanhSachNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1569, Short.MAX_VALUE))
        );
        pnlDanhSachNVLayout.setVerticalGroup(
            pnlDanhSachNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
            .addGroup(pnlDanhSachNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scr, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDanhSachNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlThongTinTC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSuKien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlThongTinTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSuKien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDanhSachNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
		model.setRowCount(0);
		DocDuLieuDatabaseVaoTable();
		xoaRongTextfields();
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
    	String gt,ngaySinh;
    	if(cboGioiTinh.getSelectedItem().equals("Nữ"))
    		gt = "0";
    	else if(cboGioiTinh.getSelectedIndex()==0)
    		gt = "";
    	else
    		gt = "1";
    	if(dchNgaySinh.getDate()==null)
    		ngaySinh = "";
    	else
    		ngaySinh = (new SimpleDateFormat("yyyy-MM-dd")).format(dchNgaySinh.getDate());
    	String maNV = txtMaNV.getText(), tenNV = txtTenNV.getText(),
    			soCMND = txtCMND.getText(), soDT = txtSDT.getText(), diaChi = txtDiaChi.getText(), chucVu = cboChucVu.getSelectedItem().toString();
    	if(cboChucVu.getSelectedIndex()==0)
    		chucVu = "";
    	model.setRowCount(0);
		ArrayList<NhanVien> dsNV = nhanVien_DAO.getNhanVien(maNV, tenNV, gt, ngaySinh, soCMND, soDT, diaChi, chucVu);
		for(NhanVien nv : dsNV) {
			String gioiTinh = "Nữ";
			if(nv.isGioiTinh()==true)
				gioiTinh="Nam";
			model.addRow(new Object[] { nv.getMaNV(),nv.getTenNV(),gioiTinh,nv.getNgaySinh()
					,nv.getSoCMND(),nv.getSoDT(),nv.getDiaChi(),nv.getChucVu().getTenChucVu()});
		}
    }//GEN-LAST:event_btnTimKiemActionPerformed
    
	public void DocDuLieuDatabaseVaoTable() {
		model.setRowCount(0);
		List<NhanVien> list = nhanVien_DAO.getAllNhanVien();
				for (NhanVien nv : list) {
					String gt = "Nữ";
					if(nv.isGioiTinh()==true)
						gt="Nam";	
					Object [] row = {nv.getMaNV(),nv.getTenNV(),gt,nv.getNgaySinh()
							,nv.getSoCMND(),nv.getSoDT(),nv.getDiaChi(),nv.getChucVu().getTenChucVu()};
					model.addRow(row);
				}
	}

	public void loadCBBChucVu(JComboBox<String> c) {
		c.removeAllItems();
		c.addItem("Chức Vụ");
		for (ChucVu cv : chucVu_DAO.getAllChucVu()) {
			c.addItem(cv.getTenChucVu());
		}
	}
	
	private void xoaRongTextfields() {
		txtMaNV.setText("");
		txtTenNV.setText("");
		cboGioiTinh.setSelectedIndex(0);
		dchNgaySinh.setDate(null);
		txtCMND.setText("");
		txtSDT.setText("");
		txtDiaChi.setText("");
		cboChucVu.setSelectedIndex(0);
	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private com.toedter.calendar.JDateChooser dchNgaySinh;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JPanel pnlDanhSachNV;
    private javax.swing.JPanel pnlSuKien;
    private javax.swing.JPanel pnlThongTinTC;
    private javax.swing.JScrollPane scr;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
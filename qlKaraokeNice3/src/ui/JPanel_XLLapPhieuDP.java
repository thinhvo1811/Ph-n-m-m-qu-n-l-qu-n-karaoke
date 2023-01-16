/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connect.Connect;
import dao.HoaDon_DAO;
import dao.KhachHang_DAO;
import dao.LoaiPhong_DAO;
import dao.NhanVien_DAO;
import dao.PhieuDatPhong_DAO;
import dao.Phong_DAO;
import entity.ChucVu;
import entity.HoaDon;
import entity.KhachHang;
import entity.LoaiPhong;
import entity.NhanVien;
import entity.PhieuDatPhong;
import entity.Phong;

/**
 *
 * @author dell
 */
public class JPanel_XLLapPhieuDP extends javax.swing.JPanel {
	private Phong_DAO phong_DAO;
	private DefaultTableModel model;
	private PhieuDatPhong_DAO pdp_DAO;
	private KhachHang_DAO khachHang_DAO;
	private NhanVien_DAO nv_DAO;
	private DefaultTableModel model2;
	private HoaDon_DAO hoaDon_DAO;
	private LoaiPhong_DAO loaiPhong_DAO;


    /**
     * Creates new form JPanelXLLapPhieuDP
     */
    public JPanel_XLLapPhieuDP() {
        initComponents();
        tblPhong.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
        tblDanhSachPDP.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
        model = (DefaultTableModel) tblPhong.getModel();
        model2 = (DefaultTableModel) tblDanhSachPDP.getModel();
 		try {
 			Connect.getInstance().connect();
 		} catch (SQLException e1) {
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}
 		phong_DAO = new Phong_DAO();
 		pdp_DAO = new PhieuDatPhong_DAO();
 		khachHang_DAO = new KhachHang_DAO();
 		nv_DAO = new NhanVien_DAO();
 		hoaDon_DAO = new HoaDon_DAO();
 		loaiPhong_DAO = new LoaiPhong_DAO();
 		DocDuLieuDatabaseVaoTable();
 		DocDuLieuDatabaseVaoTablePDP();
    }
    
    public static JLabel getLblTenKH() {
    	return lblTenKHTim;
    }
    
    public static JLabel getLblSDT() {
    	return lblSDTTim;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThongTinPDP = new javax.swing.JPanel();
        pnlDanhSachP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhong = new javax.swing.JTable();
        lblTimSDT = new javax.swing.JLabel();
        txtTimSDT = new javax.swing.JTextField();
        btnTimSDT = new javax.swing.JButton();
        btnThemKH = new javax.swing.JButton();
        lblTenKH = new javax.swing.JLabel();
        lblTenKHTim = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblSDTTim = new javax.swing.JLabel();
        lblNgayDatPhong = new javax.swing.JLabel();
        dchNgayDatPhong = new com.toedter.calendar.JDateChooser();
        lblGioDatPhong = new javax.swing.JLabel();
        cboGio = new javax.swing.JComboBox<>();
        cboPhut = new javax.swing.JComboBox<>();
        lblHaiCham = new javax.swing.JLabel();
        pnlDanhSachPDP = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachPDP = new javax.swing.JTable();
        btnNhanPhong = new javax.swing.JButton();
        btnHuyDatPhong = new javax.swing.JButton();
        btnLapPDP = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();

        pnlThongTinPDP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Phiếu Đặt Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        pnlThongTinPDP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        pnlDanhSachP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        pnlDanhSachP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tblPhong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Loại Phòng", "Giá Phòng (VNĐ)", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPhong.setRowHeight(30);
        tblPhong.getTableHeader().setBackground(new Color(255, 127, 0));
        tblPhong.setShowHorizontalLines(true);
        tblPhong.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblPhong);

        javax.swing.GroupLayout pnlDanhSachPLayout = new javax.swing.GroupLayout(pnlDanhSachP);
        pnlDanhSachP.setLayout(pnlDanhSachPLayout);
        pnlDanhSachPLayout.setHorizontalGroup(
            pnlDanhSachPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDanhSachPLayout.setVerticalGroup(
            pnlDanhSachPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTimSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimSDT.setText("Tìm SĐT:");

        txtTimSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnTimSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTimSDT.setBackground(new Color(0,191,255));
        btnTimSDT.setIcon(new javax.swing.ImageIcon("icon/TC_icon.png")); // NOI18N
        btnTimSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSDTActionPerformed(evt);
            }
        });

        btnThemKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThemKH.setBackground(new Color(0,191,255));
        btnThemKH.setIcon(new javax.swing.ImageIcon("icon/Them_icon.png")); // NOI18N
        btnThemKH.setText("Thêm KH");
        btnThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKHActionPerformed(evt);
            }
        });

        lblTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTenKH.setText("Tên KH:");

        lblTenKHTim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSDT.setText("SĐT:");

        lblSDTTim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblNgayDatPhong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNgayDatPhong.setText("Ngày Đặt Phòng:");

        dchNgayDatPhong.setDateFormatString("dd-MM-yyyy");
        dchNgayDatPhong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblGioDatPhong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGioDatPhong.setText("Giờ Đặt Phòng:");

        cboGio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboGio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        cboPhut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboPhut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        lblHaiCham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHaiCham.setText(":");

        javax.swing.GroupLayout pnlThongTinPDPLayout = new javax.swing.GroupLayout(pnlThongTinPDP);
        pnlThongTinPDP.setLayout(pnlThongTinPDPLayout);
        pnlThongTinPDPLayout.setHorizontalGroup(
            pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlDanhSachP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                                .addComponent(lblNgayDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(dchNgayDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                                .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                                        .addComponent(txtTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnThemKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                                        .addComponent(lblTenKHTim, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                                                .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblSDTTim, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                                                .addComponent(lblGioDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cboGio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblHaiCham)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboPhut, 0, 1, Short.MAX_VALUE)))))))))
                .addContainerGap())
        );
        pnlThongTinPDPLayout.setVerticalGroup(
            pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinPDPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenKHTim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSDTTim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dchNgayDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlThongTinPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboPhut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHaiCham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboGio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGioDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(pnlDanhSachP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlDanhSachPDP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Phiếu Đặt Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        pnlDanhSachPDP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tblDanhSachPDP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblDanhSachPDP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phiếu DP", "Khách Hàng", "Số Điện Thoại", "Phòng", "Ngày Đặt", "Giờ Đặt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDanhSachPDP.setRowHeight(30);
        tblDanhSachPDP.getTableHeader().setBackground(new Color(255, 127, 0));
        tblDanhSachPDP.setShowHorizontalLines(true);
        tblDanhSachPDP.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tblDanhSachPDP);

        javax.swing.GroupLayout pnlDanhSachPDPLayout = new javax.swing.GroupLayout(pnlDanhSachPDP);
        pnlDanhSachPDP.setLayout(pnlDanhSachPDPLayout);
        pnlDanhSachPDPLayout.setHorizontalGroup(
            pnlDanhSachPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachPDPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pnlDanhSachPDPLayout.setVerticalGroup(
            pnlDanhSachPDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachPDPLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        btnNhanPhong.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnNhanPhong.setBackground(new Color(0,191,255));
        btnNhanPhong.setText("Nhận Phòng");
        btnNhanPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnNhanPhongActionPerformed(evt);
            }
        });

        btnHuyDatPhong.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnHuyDatPhong.setBackground(new Color(0,191,255));
        btnHuyDatPhong.setText("Hủy Đặt Phòng");
        btnHuyDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnHuyDatPhongActionPerformed(evt);
            }
        });

        btnLapPDP.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnLapPDP.setBackground(new Color(0,191,255));
        btnLapPDP.setText("Lập Phiếu Đặt Phòng");
        btnLapPDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnLapPDPActionPerformed(evt);
            }
        });


        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnCapNhat.setBackground(new Color(0,191,255));
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlThongTinPDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDanhSachPDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(btnLapPDP, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(600, 600, 600)
                .addComponent(btnCapNhat)
                .addGap(76, 76, 76)
                .addComponent(btnNhanPhong)
                .addGap(76, 76, 76)
                .addComponent(btnHuyDatPhong)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThongTinPDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDanhSachPDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuyDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhanPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLapPDP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
		tblDanhSachPDP.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tblDanhSachPDP.getSelectedRow();
				String time = model2.getValueAt(row, 5).toString();
				lblTenKHTim.setText(model2.getValueAt(row, 1).toString());
				lblSDTTim.setText(model2.getValueAt(row, 2).toString());
				dchNgayDatPhong.setDate((java.util.Date) model2.getValueAt(row, 4));
				cboGio.setSelectedItem(time.substring(0,2));
				cboPhut.setSelectedItem(time.substring(3,5));
				for(int i=0; i<=tblPhong.getRowCount(); i++) {
					if(model.getValueAt(i, 1).toString().equals(model2.getValueAt(row, 3).toString())){
						tblPhong.setRowSelectionInterval(i, i);
						break;
					}
				}
			}
		});
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed
    	if (txtTimSDT.getText().equals("")) {
			JLabel lbl1 = new JLabel("Vui lòng nhập số điện thoại của khách hàng bạn muốn tìm!");
			lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
    		JOptionPane.showMessageDialog(this, lbl1);
		}
    	else {
			JLabel lbl2 = new JLabel("Không tìm thấy khách hàng");
			lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
        	if(khachHang_DAO.getKHTheoSDT(txtTimSDT.getText())==null) {
    			JOptionPane.showMessageDialog(this, lbl2);
    		}
    		else {
    			KhachHang kh = khachHang_DAO.getKHTheoSDT(txtTimSDT.getText());
    			lblTenKHTim.setText(kh.getTenKhachHang());
    			lblSDTTim.setText(kh.getSoDT());
    		}
    	}
    }//GEN-LAST:event_txtTimSDTActionPerformed
    
    private void btnThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed
    	JPanel_DMKhachHang ui_KH = new JPanel_DMKhachHang();
    	JPanel_XLLapPhieuDP ui_pdp = new JPanel_XLLapPhieuDP();
    	if(JPanel_TaiKhoanCuaToi.getCV().equals("NV Quản Lý")) {
        	GiaoDienChinh.getFrame().removeAll();
        	GiaoDienChinh.getFrame().add(ui_KH);
        	GiaoDienChinh.getFrame().validate();
        	ui_KH.getTblKH().addMouseListener(new MouseAdapter() {
        		@Override
        		public void mousePressed(MouseEvent e) {
        			JTable table = (JTable) e.getSource();
        			Point point = e.getPoint();
        			int row = table.rowAtPoint(point);
        			
        			if(e.getClickCount()==2 && table.getSelectedRow()!=-1) {
        				JLabel lbl1 = new JLabel("Bạn muốn chọn khách hàng " + table.getValueAt(row, 1).toString()+"?");
        				lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
        				int c = JOptionPane.showConfirmDialog(ui_KH, lbl1, "Thông báo", JOptionPane.YES_NO_OPTION);
        				if(c==JOptionPane.YES_OPTION) {
        					String ten = table.getValueAt(row, 1).toString();
        					String sdt = table.getValueAt(row, 3).toString();
        			    	GiaoDienChinh.getFrame().removeAll();
        			    	GiaoDienChinh.getFrame().add(ui_pdp);
        			    	GiaoDienChinh.getFrame().validate();
        			    	ui_pdp.getLblTenKH().setText(ten);
        			    	ui_pdp.getLblSDT().setText(sdt);
        				}
        			}
        			super.mousePressed(e);
        		}
    		});
    	}
    	else {
        	GiaoDienNhanVien.getFrame().removeAll();
        	GiaoDienNhanVien.getFrame().add(ui_KH);
        	GiaoDienNhanVien.getFrame().validate();
        	ui_KH.getTblKH().addMouseListener(new MouseAdapter() {
        		@Override
        		public void mousePressed(MouseEvent e) {
        			JTable table = (JTable) e.getSource();
        			Point point = e.getPoint();
        			int row = table.rowAtPoint(point);
        			
        			if(e.getClickCount()==2 && table.getSelectedRow()!=-1) {
        				JLabel lbl1 = new JLabel("Bạn muốn chọn khách hàng " + table.getValueAt(row, 1).toString()+"?");
        				lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
        				int c = JOptionPane.showConfirmDialog(ui_KH, lbl1, "Thông báo", JOptionPane.YES_NO_OPTION);
        				if(c==JOptionPane.YES_OPTION) {
        					String ten = table.getValueAt(row, 1).toString();
        					String sdt = table.getValueAt(row, 3).toString();
        			    	GiaoDienNhanVien.getFrame().removeAll();
        			    	GiaoDienNhanVien.getFrame().add(ui_pdp);
        			    	GiaoDienNhanVien.getFrame().validate();
        			    	ui_pdp.getLblTenKH().setText(ten);
        			    	ui_pdp.getLblSDT().setText(sdt);
        				}
        			}
        			super.mousePressed(e);
        		}
    		});
    	}
    }//GEN-LAST:event_txtTimSDTActionPerformed
    
    private void btnLapPDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed
		java.util.Date datetime = dchNgayDatPhong.getDate();
//		long d = datetime.getTime();
//		java.sql.Date date = new java.sql.Date(d);
		long millis=System.currentTimeMillis();
    	if (lblTenKHTim.getText().equals("") || lblSDTTim.getText().equals("") || datetime == null) {
			JLabel lbl1 = new JLabel("Vui lòng nhập đầy đủ thông tin!");
			lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
    		JOptionPane.showMessageDialog(this, lbl1);
		}
    	else if(tblPhong.getSelectedRow()==-1) {
			JLabel lbl2 = new JLabel("Vui lòng chọn phòng!");
			lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
    		JOptionPane.showMessageDialog(this, lbl2);
    	}
    	else if(new java.sql.Date(datetime.getTime()).toString().compareTo(new java.sql.Date(millis).toString())<0) {
			JLabel lbl2 = new JLabel("Vui lòng đặt phòng sau giờ hiện tại!");
			lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
    		JOptionPane.showMessageDialog(this, lbl2);
    	}
    	else if(model.getValueAt(tblPhong.getSelectedRow(),4).toString().equals("Đang sử dụng") && new java.sql.Date(datetime.getTime()).toString().equals(new java.sql.Date(millis).toString())) {
			JLabel lbl2 = new JLabel("Phòng này đang được sử dụng!");
			lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
    		JOptionPane.showMessageDialog(this, lbl2);
    	}
    	else{
    		int f=0;
    		List<PhieuDatPhong> list = pdp_DAO.getPhieuDatPhong();
			for (PhieuDatPhong pdp : list) {		
				if(model.getValueAt(tblPhong.getSelectedRow(), 1).toString().equals(pdp.getPhong().getTenPhong()) && new java.sql.Date(datetime.getTime()).toString().equals(pdp.getNgayDatPhong().toString())) {
					f++;
	    	    }
			}
			if(f==0) {
    			java.sql.Date ngayDP = new java.sql.Date(datetime.getTime());
    			Time gioDP = new Time(Integer.parseInt(cboGio.getSelectedItem().toString()), Integer.parseInt(cboPhut.getSelectedItem().toString()), 0);
            	PhieuDatPhong pdp = new PhieuDatPhong(pdp_DAO.getMaPDP(), new KhachHang(khachHang_DAO.getMaKHTheoSoDT(lblSDTTim.getText())), new Phong(model.getValueAt(tblPhong.getSelectedRow(), 0).toString()), ngayDP, gioDP);
                pdp_DAO.addPhieuDatPhong(pdp);
                DocDuLieuDatabaseVaoTable();
                DocDuLieuDatabaseVaoTablePDP();
                xoaRongTextfields();
			}
			else {
    			JLabel lbl2 = new JLabel("Phòng này đã được đặt vào ngày đó");
    			lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
        		JOptionPane.showMessageDialog(this, lbl2);
			}
    	}
    }//GEN-LAST:event_txtTimSDTActionPerformed
    
    private void btnHuyDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed
		int row = tblDanhSachPDP.getSelectedRow();
		if (row != -1) {
			JLabel lbl1 = new JLabel("Bạn có chắc muốn hủy phiếu đặt phòng này không?");
			lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
			int ask = JOptionPane.showConfirmDialog(this, lbl1, "Cảnh Báo!", JOptionPane.YES_NO_OPTION);
			if(ask == JOptionPane.YES_OPTION) {
		    	pdp_DAO.deletePhieuDatPhong(model2.getValueAt(tblDanhSachPDP.getSelectedRow(), 0).toString());
		        DocDuLieuDatabaseVaoTablePDP();
		        xoaRongTextfields();
				JLabel lbl2 = new JLabel("Hủy thành công");
				lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
				JOptionPane.showMessageDialog(this, lbl2);
				if(row < pdp_DAO.getAllPhieuDatPhong().size() - 1) {
					selectedRow(row);
				} else if(pdp_DAO.getAllPhieuDatPhong().size() > 0) {
					row = 0;
					selectedRow(row);
				}
			}
		}else {
			JLabel lbl3 = new JLabel("Bạn chưa chọn phiếu đặt phòng muốn hủy");
			lbl3.setFont(new Font("Arial", Font.PLAIN, 18));
			JOptionPane.showMessageDialog(this, lbl3);
		}
    }//GEN-LAST:event_txtTimSDTActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed
		int row = tblDanhSachPDP.getSelectedRow();
		if (row != -1) {
	    	java.util.Date datetime = dchNgayDatPhong.getDate();
//			long d = datetime.getTime();
//			java.sql.Date date = new java.sql.Date(d);
			long millis=System.currentTimeMillis();
	    	if (lblTenKHTim.getText().equals("") || lblSDTTim.getText().equals("") || datetime == null) {
				JLabel lbl1 = new JLabel("Vui lòng nhập đầy đủ thông tin!");
				lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
	    		JOptionPane.showMessageDialog(this, lbl1);
			}
	    	else if(tblPhong.getSelectedRow()==-1) {
				JLabel lbl2 = new JLabel("Vui lòng chọn phòng!");
				lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
	    		JOptionPane.showMessageDialog(this, lbl2);
	    	}
	    	else if(new java.sql.Date(datetime.getTime()).toString().compareTo(new java.sql.Date(millis).toString())<0) {
				JLabel lbl2 = new JLabel("Vui lòng đặt phòng sau giờ hiện tại!");
				lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
	    		JOptionPane.showMessageDialog(this, lbl2);
	    	}
	    	else if(model.getValueAt(tblPhong.getSelectedRow(),4).toString().equals("Đang sử dụng") && new java.sql.Date(datetime.getTime()).toString().equals(new java.sql.Date(millis).toString())) {
				JLabel lbl2 = new JLabel("Phòng này đang được sử dụng!");
				lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
	    		JOptionPane.showMessageDialog(this, lbl2);
	    	}
	    	else{
	    		int f=0;
				for(int i=0; i<tblDanhSachPDP.getRowCount(); i++) {
					if(model.getValueAt(tblPhong.getSelectedRow(), 1).toString().equals(model2.getValueAt(i, 3).toString())) {
			    		if(dchNgayDatPhong.getDate().equals((java.util.Date) model2.getValueAt(i, 4))) {
			    			if(i!=tblDanhSachPDP.getSelectedRow())
			    				f++;
			    		}
					}
				}
				if(f==0) {
	    			java.sql.Date ngayDP = new java.sql.Date(datetime.getTime());
	    			Time gioDP = new Time(Integer.parseInt(cboGio.getSelectedItem().toString()), Integer.parseInt(cboPhut.getSelectedItem().toString()), 0);
	            	PhieuDatPhong pdp = new PhieuDatPhong(model2.getValueAt(tblDanhSachPDP.getSelectedRow(), 0).toString(), new KhachHang(khachHang_DAO.getMaKHTheoSoDT(lblSDTTim.getText())), new Phong(model.getValueAt(tblPhong.getSelectedRow(), 0).toString()), ngayDP, gioDP);
	                pdp_DAO.updatePDP(pdp);
	                DocDuLieuDatabaseVaoTable();
	                DocDuLieuDatabaseVaoTablePDP();
	                xoaRongTextfields();
				}
				else {
	    			JLabel lbl2 = new JLabel("Phòng này đã được đặt vào ngày đó");
	    			lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
	        		JOptionPane.showMessageDialog(this, lbl2);
				}
	    	}
		}else {
			JLabel lbl3 = new JLabel("Bạn chưa chọn phiếu đặt phòng muốn cập nhật");
			lbl3.setFont(new Font("Arial", Font.PLAIN, 18));
			JOptionPane.showMessageDialog(this, lbl3);
		}
    }//GEN-LAST:event_txtTimSDTActionPerformed
    
    private void btnNhanPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed
		int row = tblDanhSachPDP.getSelectedRow();
		if (row != -1) {
			JLabel lbl1 = new JLabel("Bạn có chắc muốn nhận phòng này không?");
			lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
			int ask = JOptionPane.showConfirmDialog(this, lbl1, "Cảnh Báo!", JOptionPane.YES_NO_OPTION);
			if(ask == JOptionPane.YES_OPTION) {
				long millis=System.currentTimeMillis();
	        	HoaDon hd = new HoaDon(hoaDon_DAO.getMaHoaDon(), new java.sql.Date(millis), new NhanVien(nv_DAO.getNVtheoMa(JPanel_TaiKhoanCuaToi.getNV()).getMaNV()), new KhachHang(khachHang_DAO.getMaKHTheoSoDT(lblSDTTim.getText())), new Phong(model.getValueAt(tblPhong.getSelectedRow(), 0).toString()), new java.sql.Time(millis), false);
	            hoaDon_DAO.addHoaDonKCoNVVaGR(hd);
    	        Phong p = new Phong(model.getValueAt(tblPhong.getSelectedRow(), 0).toString(), model.getValueAt(tblPhong.getSelectedRow(), 1).toString(), false,  new LoaiPhong(loaiPhong_DAO.getMaLoaiPTheoTen(model.getValueAt(tblPhong.getSelectedRow(), 2).toString())));
	            phong_DAO.updatePhong(p);
	            pdp_DAO.deletePhieuDatPhong(model2.getValueAt(tblDanhSachPDP.getSelectedRow(), 0).toString());
	            DocDuLieuDatabaseVaoTable();
	            DocDuLieuDatabaseVaoTablePDP();
	            xoaRongTextfields();
			}
		}else {
			JLabel lbl3 = new JLabel("Bạn cần chọn phiếu đặt phòng muốn nhận");
			lbl3.setFont(new Font("Arial", Font.PLAIN, 18));
			JOptionPane.showMessageDialog(this, lbl3);
		}
    }//GEN-LAST:event_txtTimSDTActionPerformed
    
	public void DocDuLieuDatabaseVaoTable() {
		model.setRowCount(0);
		DecimalFormat formatter = new DecimalFormat("###,###,###");
		List<Phong> list = phong_DAO.getAllPhong();
				for (Phong p : list) {	
					String tt = "Trống";
					if(p.getTrangThai()==false)
						tt="Đang sử dụng";	
					Object [] row = {p.getMaPhong(),p.getTenPhong(),p.getLoaiPhong().getTenloai(),formatter.format(p.getLoaiPhong().getGiaPhong()),tt};
					model.addRow(row);
				}
	}
	
	public void DocDuLieuDatabaseVaoTablePDP() {
		model2.setRowCount(0);
		List<PhieuDatPhong> list = pdp_DAO.getAllPhieuDatPhong();
				for (PhieuDatPhong pdp : list) {		
					Object [] row = {pdp.getMaPhieuDatPhong(),pdp.getKhachhang().getTenKhachHang(),pdp.getKhachhang().getSoDT(),pdp.getPhong().getTenPhong(),pdp.getNgayDatPhong(),pdp.getGioDatPhong()};
					model2.addRow(row);
				}
	}
	
	private void xoaRongTextfields() {
        txtTimSDT.setText("");
		lblSDTTim.setText("");
		lblTenKHTim.setText("");;
		dchNgayDatPhong.setDate(null);
		cboGio.setSelectedIndex(0);
		cboPhut.setSelectedIndex(0);
	}
    
	private void selectedRow(int row) {
		if(row != -1) {
			tblDanhSachPDP.setRowSelectionInterval(row, row);
			tblDanhSachPDP.scrollRectToVisible(tblDanhSachPDP.getCellRect(row, row, true));
		}
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyDatPhong;
    private javax.swing.JButton btnLapPDP;
    private javax.swing.JButton btnNhanPhong;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThemKH;
    private javax.swing.JButton btnTimSDT;
    private javax.swing.JComboBox<String> cboGio;
    private javax.swing.JComboBox<String> cboPhut;
    private com.toedter.calendar.JDateChooser dchNgayDatPhong;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGioDatPhong;
    private javax.swing.JLabel lblHaiCham;
    private javax.swing.JLabel lblNgayDatPhong;
    private javax.swing.JLabel lblSDT;
    private static javax.swing.JLabel lblSDTTim;
    private javax.swing.JLabel lblTenKH;
    private static javax.swing.JLabel lblTenKHTim;
    private javax.swing.JLabel lblTimSDT;
    private javax.swing.JPanel pnlDanhSachP;
    private javax.swing.JPanel pnlDanhSachPDP;
    private javax.swing.JPanel pnlThongTinPDP;
    private javax.swing.JTable tblDanhSachPDP;
    private javax.swing.JTable tblPhong;
    private javax.swing.JTextField txtTimSDT;
    // End of variables declaration//GEN-END:variables
}
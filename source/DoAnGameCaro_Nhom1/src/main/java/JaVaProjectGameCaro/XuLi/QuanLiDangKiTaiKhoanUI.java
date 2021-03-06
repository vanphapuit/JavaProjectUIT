package JaVaProjectGameCaro.XuLi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import JaVaProjectGameCaro.Model.LoaiXepHang;
import JaVaProjectGameCaro.Model.NguoiChoi;
import JaVaProjectGameCaro.Model.NguoiChoiDAO;

public class QuanLiDangKiTaiKhoanUI {
	private JButton btnDangKy;
	private JButton btnThoat;
    
    private JPasswordField txtNhapLaiPass;
    private JPasswordField txtPassword;
    private JTextField txtTenHienThi;
    private JTextField txtUsername;
    
    private JFrame JFLoginNow;
    private JFrame JFDangKiNow;
    
    private boolean isThuThitxtUsername=false;
    private boolean isThuThitxtTenHienThi=false;
    private boolean isThuThitxtPassword=false;
    private boolean isThuThitxtNhapLaiPass=false;
 

	public QuanLiDangKiTaiKhoanUI(JButton btnDangKy, JButton btnThoat, JTextField txtUsername,JTextField txtTenHienThi, JPasswordField txtPassword, JPasswordField txtNhapLaiPass, JFrame jFLoginNow,JFrame JFDangKiNow) {
		this.btnDangKy = btnDangKy;
		this.btnThoat = btnThoat;
		this.txtNhapLaiPass = txtNhapLaiPass;
		this.txtPassword = txtPassword;
		this.txtTenHienThi = txtTenHienThi;
		this.txtUsername = txtUsername;
		JFLoginNow = jFLoginNow;
		this.JFDangKiNow=JFDangKiNow;
		addEvents();
	}
	private void addEvents() {
		
		this.txtUsername.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(isThuThitxtUsername==false) {
					txtUsername.setText(null);
					isThuThitxtUsername=true;
				}
			}
		});
		
		this.txtTenHienThi.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(isThuThitxtTenHienThi==false) {
					txtTenHienThi.setText(null);
					isThuThitxtTenHienThi=true;
				}
			}
		});
		
		
		this.txtPassword.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(isThuThitxtPassword==false) {
					txtPassword.setText(null);
					isThuThitxtPassword=true;
				}
			}
		});
		
		
		this.txtNhapLaiPass.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(isThuThitxtNhapLaiPass==false) {
					txtNhapLaiPass.setText(null);
					isThuThitxtNhapLaiPass=true;
				}
			}
		});
		
		btnThoat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFDangKiNow.dispose();
				JFLoginNow.setVisible(true);
				
			}
		});
		
		this.btnDangKy.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLinutDangKi();
			}
		});
	}
	private void xuLinutDangKi() {
		// TODO Auto-generated method stub
		if(this.txtUsername.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "T??n t??i kho???n kh??ng ???????c ????? tr???ng !");
			return;
		}
		
		Pattern patternUserName=Pattern.compile("[a-z0-9_-]{6,20}$");
		if(patternUserName.matcher(txtUsername.getText()).matches()==false) {
			JOptionPane.showMessageDialog(null, "T??n t??i kho???n c?? ????? t??i t??? 6 ?????n 20 k?? t???, kh??ng c?? kho???ng tr???ng, "
					+ "\r\n"
					+ "kh??ng d???u kh??ng ch???a ch??? in hoa v?? k?? t??? ?????c bi??t\r\n");
			return;
		}
		
	
		Pattern patternPassWord=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})");
		if(patternPassWord.matcher(txtPassword.getText()).matches()==false) {
			JOptionPane.showMessageDialog(null, "M???t kh???u c?? ????? d??i t??? 8 ?????n 20 k?? t??? v?? :"
					+ "\r\n"
					+ "          + Ph???i ch???a ??t nh???t 1 k?? t??? s??? t??? 0 ??? 9\r\n"
					+ "\r\n"
					+ "          + Ph???i ch???a ??t nh???t 1 k?? t??? ch??? th?????ng\r\n"
					+ "\r\n"
					+ "          + Ph???i ch???a ??t nh???t 1 k?? t??? ch??? hoa\r\n"
					+ "\r\n"
					+ "          + Kh??ng ???????c ch???a k?? t??? ti???ng vi???t\r\n"
					+ "\r\n"
					+ "          + Ph???i ch???a ??t nh???t 1 k?? t??? trong t???p c??c k?? t??? [@ # $ %]");
			
			txtPassword.setText(null);
			
			return;
		}
		
		if(txtPassword.getText().contentEquals(txtNhapLaiPass.getText())==false) {
			JOptionPane.showMessageDialog(null, "M???t Kh???u Kh??ng Kh???p V???i Nhau Vui L??ng Nh???p L???i ! ");
			txtNhapLaiPass.setText(null);
			return;
		}
		
		
		NguoiChoi ncDK=new NguoiChoi();
		ncDK.setTenDangNhap(txtUsername.getText());
		ncDK.setMatKhau(txtPassword.getText());
		ncDK.setTenHienThi(txtTenHienThi.getText());
		ncDK.setDiemXepHang(0);
		ncDK.setSoLanThang(0);
		ncDK.setSoLanThua(0);
		LoaiXepHang ncXH=new LoaiXepHang();
		ncXH.setIdXepHang(7);
		ncDK.setLoaiXepHang(ncXH);
		
		Boolean DK=NguoiChoiDAO.themNguoiChoi(ncDK);
		if(DK=false) {
			JOptionPane.showMessageDialog(null, "T??i Kho???n ???? T???n T???i Vui L??ng Th??? L???i");
			return;
		}else {
			JOptionPane.showMessageDialog(null, "????ng K?? T??i Kho???n Th??nh C??ng !");
			JFDangKiNow.dispose();
			JFLoginNow.setVisible(true);
		}
	}
	

}

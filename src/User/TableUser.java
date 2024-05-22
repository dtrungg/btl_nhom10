package User;
import java.util.*;
import javax.swing.table.AbstractTableModel;


public class TableUser extends AbstractTableModel {
    String title[] = {"Mã nhân viên", "Họ tên", "Số điện thoại", "Ngày sinh", "Quê quán", "Tài khoản", "Mật khẩu", "Chức vụ"};
    Class value[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    ArrayList<User> listUser = new ArrayList<>();

    public TableUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    @Override
    public int getRowCount() {
        return listUser.size();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        return title.length;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        return value[columnIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getColumnName(int column) {
        return title[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return listUser.get(rowIndex).getMaNV();
            case 1: return listUser.get(rowIndex).getHoTen();
            case 2: return listUser.get(rowIndex).getSoDienThoai();
            case 3: return listUser.get(rowIndex).getNgaySinh();
            case 4: return listUser.get(rowIndex).getQueQuan();
            case 5: return listUser.get(rowIndex).getTaiKhoan();
            case 6: return listUser.get(rowIndex).getMatKhau();
            case 7: return listUser.get(rowIndex).getChucVu();
            default: return null;
        }
    }
    
}

package in.ahmed.beans;

import org.springframework.jdbc.core.JdbcTemplate;




public class BookDao implements IBookDao {
	private JdbcTemplate jdbctemplete;
	

	public void setJdbctemplete(JdbcTemplate jdbctemplete) {
		this.jdbctemplete = jdbctemplete;
	}


	@Override
	public void readData(int bookid, String bookname, double price) {

		String query = "insert into  Book values(?,?,?)";
		
		jdbctemplete.update(query,ps ->{
			ps.setInt(1, bookid);
			ps.setString(2, bookname);
			ps.setDouble(3, price);
		});

	}

}

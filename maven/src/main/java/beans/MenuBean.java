package beans;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;



public class MenuBean implements Serializable, Closeable{
	private static final long serialVersionUID = 3026876160626760662L;

	List<String> menuList;

	
	

	
	public List<String> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<String> menuList) {
		this.menuList = menuList;
	}
	public MenuBean() {
		super();
	}
	public MenuBean(List<String> menuList) {
		super();
		this.menuList = menuList;
	}
	@Override
	public void close() throws IOException {
		
		
	}
	

}

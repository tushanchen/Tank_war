import java.awt.*;
//change in pc
public class CommonWall {
	public static final int width = 20; //设置墙的固定参数
	public static final int length = 20;
	int x, y;
//hhhhhpcpcpcpcp
	TankClient tc;
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	private static Image[] wallImags = null;
	static {
		wallImags = new Image[] { // 储存commonWall的图片
		tk.getImage(CommonWall.class.getResource("Images/commonWall.gif")), };
	}
	public CommonWall(int x, int y, TankClient tc) { // 构造函数
		this.x = x;
		this.y = y;
		this.tc = tc; // 恢�
	}

	public void draw(Graphics g) {// 画commonWall
		g.drawImage(wallImags[0], x, y, null);
	}

	public Rectangle getRect() {  //delete you pc
		return new Rectangle(x, y, width, length);
	}

}

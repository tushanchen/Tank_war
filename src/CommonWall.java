import java.awt.*;
//change in pc
public class CommonWall {
	public static final int width = 20; //ÉèÖÃÇ½µÄ¹Ì¶¨²ÎÊý
	public static final int length = 20;
	int x, y;
//hhhhhpcpcpcpcp
	TankClient tc;
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	private static Image[] wallImags = null;
	static {
		wallImags = new Image[] { // ´¢´æcommonWallµÄÍ¼Æ¬
		tk.getImage(CommonWall.class.getResource("Images/commonWall.gif")), };
	}
	public CommonWall(int x, int y, TankClient tc) { // ¹¹Ôìº¯Êý
		this.x = x;
		this.y = y;
		this.tc = tc; // »ÖÆ
	}

	public void draw(Graphics g) {// »­commonWall
		g.drawImage(wallImags[0], x, y, null);
	}

	public Rectangle getRect() {  //delete you pc
		return new Rectangle(x, y, width, length);
	}

}

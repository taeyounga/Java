package java_20170929;

public class MultiChatClientTest {
	public static void main(String[] args) {
		MultiChatClient client = new MultiChatClient();
		new Thread(client).start();
	}
}

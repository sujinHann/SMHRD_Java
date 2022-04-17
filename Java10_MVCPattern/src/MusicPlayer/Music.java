package MusicPlayer;

public class Music {

	// model

	// mp3 ������
	// �뷡���� -> title
	// �����̸� -> singer
	// ����ð� -> playTime
	// getter -> �����͸� ������ �ð�
	// ������ �޼���
	// ���������� -> private

	private String title;
	private String singer;
	private int playTime;

	// ��ο� ���� ������ �ֱ�
	private String path;

	public Music(String title, String singer, int playTime, String path) {
		// super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public String getPath() {
		return path;
	}
}

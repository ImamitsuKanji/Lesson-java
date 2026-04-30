package jp.co.aforce.sample.exercise.StaticFieldPractice;

public class Configuration {
	static String appName;
	static String version;
	
	public Configuration(String appName, String version) {
		Configuration.appName = appName;
		Configuration.version = version;
	}
	
	static {
		
		String appName = "未記入";
		String version = "未記入";
		
		System.out.println("初期化");
		System.out.println("アプリ名:" + appName);
		System.out.println("バージョン:" + version);
	}
	
	void showName() {
		System.out.println("アプリ名:" + appName + "\nバージョン:" + version);
	}

	public static void main(String[] args) {
		Configuration configuration = new Configuration("chatGPT", "GPT-5.3");
		configuration.showName();

	}

}

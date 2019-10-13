abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap{
	private int length;
	private int idx=0;
	private int del_pos;
	
	public Dictionary(int length) {
		this.length = length;
		keyArray = new String[length];
		valueArray = new String[length];
	}
	@Override
	int length() {
		return length;
	}
	@Override
	void put(String key, String value) {
		for(int i=0;i<idx;i++)
		{
			if(keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		
		keyArray[idx] = key;
		valueArray[idx] = value;
		idx++;
	}
	@Override
	String get(String key) {
		for(int i=0;i<idx;i++)
		{
			try {
			if(keyArray[i].equals(key)){	return valueArray[i];			}
			}
			catch(NullPointerException e){
				continue;
			}
		}
		return null;
	}
	@Override
	String delete(String key) {
		for(int i=0;i<idx;i++)
		{
			if(keyArray[i].equals(key))
			{
				keyArray[i] = null;
				valueArray[i] = null;
				return null;
			}
		}
		return null;
	}
}

public class JS05_10_15012970 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");	//���繮�� ���� C++�� ����.
		System.out.println("���繮�� ���� "+ dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����"));
	}
}

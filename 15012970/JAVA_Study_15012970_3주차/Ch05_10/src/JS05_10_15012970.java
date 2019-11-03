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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");	//이재문의 값을 C++로 수정.
		System.out.println("이재문의 값은 "+ dic.get("이재문"));
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
	}
}

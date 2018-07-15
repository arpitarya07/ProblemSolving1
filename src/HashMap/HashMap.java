package HashMap;

public class HashMap {
// HashMap is an array of key, value pairs
	HashEntry hashMap[];
	int size;
	public HashMap() {
		size = 5;
		hashMap = new HashEntry[size];
	}
	
	public HashMap(HashEntry hashMap[]) {
		size = 5;
		this.hashMap = hashMap;
	}
	
	public int hashCode(int key) {
		int index = key%size;
		return index;
	}
	
	public void put(HashEntry h1) {
		
		int index = hashCode(h1.key);
		
		if(hashMap[index] != null) {	
			index++;
			index = index%size;
		}
		hashMap[index] = h1;
	}
	
	public HashEntry get(int key) {
		
		int index = hashCode(key);
		HashEntry temp = hashMap[index];
		if(temp.key == key) {
			return temp;
		}
		else {
			index++;
			index = index%size;
			return hashMap[index];
		}
	}
	

	public static void main(String[] args) {
		
		HashMap h1 = new HashMap();
		h1.put(1);

	}

}

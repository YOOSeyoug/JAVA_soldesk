package chapter12.hashcode;

public class Key {

	public int number;
	public int name;
	public int addr;
	
	public Key(int number) {
		this.number = number;
	}

	//拱府利 林家
	@Override
	public int hashCode() {
		//return super.hashCode(); -> 角力 heap皋葛府 16柳荐 林家
		return number;
	}

	//稠府利 林家(单捞磐)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Key) {
			Key comapareKey = (Key) obj;
			if(this.number==comapareKey.number) {
				return true;
			}
		}else {
			return false;
		}
		
		return super.equals(obj);
	}
	
	
	
	
	
}

// 実装する複数のI/Fに同名のメソッドがあったら、コンパイルエラー
class Teachar implements Person, Persistent {
	public long getId() {
		return 50;
	}
// 必ず、どちらかのデフォルトメソッドを利用するか明記する必要がある
	public String getName(){
		return Person.super.getName();
	}
}

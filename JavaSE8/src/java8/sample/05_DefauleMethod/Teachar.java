// �������镡����I/F�ɓ����̃��\�b�h����������A�R���p�C���G���[
class Teachar implements Person, Persistent {
	public long getId() {
		return 50;
	}
// �K���A�ǂ��炩�̃f�t�H���g���\�b�h�𗘗p���邩���L����K�v������
	public String getName(){
		return Person.super.getName();
	}
}

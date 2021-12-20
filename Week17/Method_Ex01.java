package Week17;

public class Method_Ex01 {
    public static void main(String[] args) {
        // method แบบที่ 1  ไม่มีการส่งค่าจาก method main  และ ไม่มีการคืนค่ากลับจาก method ลูก
        openFile();
        playFile();
        pauseFile();
        closeFile();
    }
    static void openFile(){
        System.out.println("Open file...........");
        
    }
    static void playFile(){
        System.out.println("Play music..........");
        
    }
    static void pauseFile(){
        System.out.println("Stop music..........");
        
    }
    static void closeFile(){
        System.out.println("Exit..........");
        
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Lv1 {
    private static class you{
        String name;
        private int hp;
        private int attack;
        public void readyou(){
            System.out.println ("请输入英雄名字");
            Scanner a1=new Scanner (System.in);
            name=a1.nextLine ();
            System.out.println ("请输入英雄血量");
            Scanner a2=new Scanner (System.in);
            hp= a2.nextInt ();
            System.out.println ("请输入英雄攻击力");
            Scanner a3=new Scanner (System.in);
            attack=a3.nextInt ();

        }
    }
    public static class monster{
        String name;
        private int hp;
        private int attack;
        public void readmonster(){
            System.out.println ("请输入怪物名字");
            Scanner a1=new Scanner (System.in);
            name=a1.nextLine ();
            System.out.println ("请输入怪物血量");
            Scanner a2=new Scanner (System.in);
            hp= a2.nextInt ();
            System.out.println ("请输入怪物攻击力");
            Scanner a3=new Scanner (System.in);
            attack=a3.nextInt ();
        }
    }
    public static void main(String[] args) {
        you s1=new you ();
        monster s2=new monster ();
        fight s3=new fight ();
        s1.readyou ();
        s2.readmonster ();
        s3.fight (s1.name,s2.name,s1.hp,s2.hp,s1.attack, s2.attack);
    }
    public static class fight{
        public void xuetiao(int hp1,int hp2,String name1,String name2){
            System.out.print (name1);
            for (int i = 0; i < hp1; i++) {
                System.out.print ("❤");
            }
            System.out.println (" ");
            System.out.print (name2);
            for (int i = 0; i < hp2; i++) {
                System.out.print ("❤");
            }
            System.out.println (" ");
        }
        public void fight(String name1,String name2,int hp1,int hp2,int attack1,int attack2){
            for (int i = 0;i<=100; i++) {
                if(i==0){
                    xuetiao(hp1,hp2,name1,name2);
                }
                System.out.println (name1+"攻击");
                hp2-=attack1;
                if(hp2<=0){
                    System.out.println (name2+"被击败");
                    break;
                }
                xuetiao(hp1,hp2,name1,name2);
                System.out.println (name2+"攻击");
                hp1-=attack2;
                if(hp1<=0){
                    System.out.println (name1+"被击败");
                    break;
                }
                xuetiao(hp1,hp2,name1,name2);
            }
        }
    }
}

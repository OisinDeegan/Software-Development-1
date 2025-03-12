import java.util.Random;
import java.util.Scanner;

import t2week6.power;
public class wahatest {
    public static void main(String[] args) {
        Random ranNum = new Random();
        Scanner input= new Scanner(System.in);
        /* Setting up variables */
        int x, y, bs, str, t, attack, models, susMod =0;
        int whileControl1 =1;
        int whileControl2=1;
        String fancy = "";
        boolean Lethal, DevWo, Sus =false;
        /* Data input */
        System.out.print("Enter the amount of models in the attacking unit: ");
        models=input.nextInt();
        System.out.print("Enter the amount of attacks: ");
        attack=input.nextInt();
        System.out.print("Enter the ballistics/weapons skill: ");
        bs=input.nextInt();
        System.out.print("Enter the strength: ");
        str=input.nextInt();
        System.out.print("Enter the toughness of your opponent: ");
        t=input.nextInt();
        System.out.print("Does the attack have any special effects? (y/n to open selection): ");
        fancy=input.next();
        if (fancy.equalsIgnoreCase("y")) {
            System.out.print("Does the attack have Lethal Hits? (y/n): ");
            fancy=input.next();
            if (fancy.equalsIgnoreCase("y")) {
                Lethal=true;
            }
            System.out.print("Does the attack have Devestating Wounds? (y/n): ");
            fancy=input.next();
            if (fancy.equalsIgnoreCase("y")) {
                DevWo=true;
            }
            System.out.print("Does the attack have Sustained hits? (y/n): ");
            fancy=input.next();
            if (fancy.equalsIgnoreCase("y")) {
                Sus=true;
            }
        }
        if (Sus==true) {
            System.out.println("what is the modifier? (e.g. Sustained Hits 1)");
            susMod=input.nextInt();
        }
        
        /* Calculations */
        while (whileControl2<=models) {
            System.out.println();
            if (models==1) {
                System.out.print("Only model ");
            }else{
                System.out.print("Model "+whileControl2+" ");
            }
            whileControl1=1;
            while (whileControl1<=attack) {
                System.out.println();
                System.out.println("Attack number "+whileControl1);
                y=ranNum.nextInt(6) + 1;
                x=ranNum.nextInt(6) + 1;
                if (y>=bs) {
                    if (Sus) {
                        
                    }
                    System.out.println("Your attack hit! WAAAAGH!!");
                    if (str==t) {
                        System.out.println("You wound on 4s");
                        if (x>=4) {
                            System.out.println("You wound them!");
                        } else {
                            System.out.println("You do not wound them");
                        }
                    }else if ((str/2)>=t) {
                        System.out.println("You wound on 2s");
                        if (x>=2) {
                            System.out.println("You wound them!");
                        } else {
                            System.out.println("You do not wound them");
                        }
                    }else if (str>t) {
                        System.out.println("You wound on 3s");
                        if (x>=3) {
                            System.out.println("You wound them!");
                        } else {
                            System.out.println("You do not wound them");
                        }
                    }else if ((t/2)>=str) {
                        System.out.println("You wound on 6s");
                        if (x>=6) {
                            System.out.println("You wound them!");
                        } else {
                            System.out.println("You do not wound them");
                        }
                    }else if (t>str) {
                        System.out.println("You wound on 5s");
                        if (x>=5) {
                            System.out.println("You wound them!");
                        } else {
                            System.out.println("You do not wound them");
                        }
                    }
                } else {
                    System.out.println("Your attack failed to hit. sad waaagh");
                }
                whileControl1++;
            }
            whileControl2++;
        }
        
        input.close();
    }
    
}
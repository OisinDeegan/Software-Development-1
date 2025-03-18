import java.util.Random;
import java.util.Scanner;

public class wahatest {
    public static void main(String[] args) {
        Random ranNum = new Random();
        Scanner input= new Scanner(System.in);
        /* Setting up variables */
        int x, y=0;
        int bs =0;
        int str =0;
        int t=0;
        int ws=0;
        int attack=0;
        int models=0;
        int susModTotal =0;
        int gameMode =0;
        int susMod =0;
        int susModCounter=0;
        int whileControl1 =1;
        int whileControl2=1;
        String fancy = "";
        boolean Lethal=false;
        boolean DevWo=false;
        boolean Sus =false;
        boolean critMortal=false;
        /* Data input */
        System.out.print("Are you playing Age of Sigmar or 40K? (1 for AoS, 2 for 40K): ");
        gameMode=input.nextInt();
        while (gameMode!=1&&gameMode!=2) {
            System.out.print("Please enter 1 or 2: ");
            gameMode=input.nextInt();
        }

        /*AoS+40k seperator*/
        if (gameMode==1) {
            /*Aos */
            System.out.print("Enter the amount of models in the attacking unit: ");
            models=input.nextInt();
            System.out.print("Enter the amount of attacks: ");
            attack=input.nextInt();
            System.out.print("Enter the weapons skill: ");
            bs=input.nextInt();
            System.out.print("Enter the to wound value: ");
            ws=input.nextInt();
            System.out.print("Does the attack have any special effects? (y/n to open selection): ");
            fancy=input.next();
            if (fancy.equalsIgnoreCase("y")) {
                System.out.print("Does the attack have Crit(Auto-Wound)? (y/n): ");
                fancy=input.next();
                if (fancy.equalsIgnoreCase("y")) {
                    Lethal=true;
                }
                System.out.print("Does the attack have Crit(2 hits)? (y/n): ");
                fancy=input.next();
                if (fancy.equalsIgnoreCase("y")) {
                    Sus=true;
                }
                System.out.print("Does the attack have Crit(Mortals)? (y/n): ");
                fancy=input.next();
                if (fancy.equalsIgnoreCase("y")) {
                    critMortal=true;
                }
            }
                /* AoS Calculations */
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
                        System.out.println("Your attack hit! WAAAAGH!!");
                        susMod=1;
                        if (Sus) {
                            if (y==6) {
                                System.out.println("Your attack critically hit and scores an additional "+susMod+" hits! WAAAGH!!");
                                susModTotal+=susMod;
                            }
                            if (x>=ws) {
                                System.out.println("With a roll of "+x+" you wound them!");
                            } else {
                                System.out.println("With a roll of "+x+" you do not wound them");
                            }
                            /*sustained hits should work */
                            susModCounter=1;
                            if (susModCounter<=susModTotal) {
                                while (susModCounter<=susModTotal) {
                                    x=ranNum.nextInt(6) + 1;
                                    System.out.println("Addtional hit no."+susModCounter);
                                    if (x>=ws) {
                                        System.out.println("With a roll of "+x+" you wound them!");
                                    } else {
                                        System.out.println("With a roll of "+x+" you do not wound them");
                                    }
                                    susModCounter++;
                                }
                                susModTotal=0;
                            }
                        } else if (Lethal==true) {
                            if (y==6) {
                                System.out.println("Your attack critically hit and automatically wounded! WAAAGH!!");
                            }else if (x>=ws) {
                                System.out.println("With a roll of "+x+" you wound them!");
                            } else {
                                System.out.println("With a roll of "+x+" you do not wound them");
                            }
                        }else if (critMortal==true) {
                            if (y==6) {
                                System.out.println("Your attack critically hit and automatically deals Mortal WOUNDS!! WAAAGH!!");
                            }else if (x>=ws) {
                                System.out.println("With a roll of "+x+" you wound them!");
                            } else {
                                System.out.println("With a roll of "+x+" you do not wound them");
                            }
                        } else 
                        /*normal rolls */
                        if (x>=ws) {
                            System.out.println("With a roll of "+x+" you wound them!");
                        } else {
                            System.out.println("With a roll of "+x+" you do not wound them");
                        }
                    } else {
                        System.out.println("Your attack failed to hit. sad waaagh");
                    }
                    whileControl1++;
                }
                whileControl2++;    
            }
        } else {
            /*40k */
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
                System.out.print("what is the modifier? (e.g. Sustained Hits 1): ");
                susMod=input.nextInt();
            }
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
                        System.out.println("Your attack hit! WAAAAGH!!");
                        if (Sus==true && Lethal==true) {
                            if (y==6) {
                                System.out.println("Your attack critically hit and automatically wounded AND scores an additional "+susMod+" hits! WAAAGH!!");
                                susModTotal+=susMod;
                            }else if (str==t) {
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
                            susModCounter=1;
                            if (susModCounter<=susModTotal) {
                                while (susModCounter<=susModTotal) {
                                    x=ranNum.nextInt(6) + 1;
                                    System.out.println("Sustained Hit no."+susModCounter);
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
                                    susModCounter++;
                                }
                                susModTotal=0;
                            }
                        } else if (Sus) {
                            if (y==6) {
                                System.out.println("Your attack critically hit and scores an additional "+susMod+" hits! WAAAGH!!");
                                susModTotal+=susMod;
                            }
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
                            /*sustained hits should work */
                            susModCounter=1;
                            if (susModCounter<=susModTotal) {
                                while (susModCounter<=susModTotal) {
                                    x=ranNum.nextInt(6) + 1;
                                    System.out.println("Sustained Hit no."+susModCounter);
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
                                    susModCounter++;
                                }
                                susModTotal=0;
                            }
                        } else if (Lethal==true) {
                                if (y==6) {
                                    System.out.println("Your attack critically hit and automatically wounded! WAAAGH!!");
                                }else if (str==t) {
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
                        }else if (str==t) {
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
        }
        input.close();
    }
}

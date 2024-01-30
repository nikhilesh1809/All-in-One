import java.util.Scanner;
import java.util.Random;//generate random no.class
import java.awt.Desktop;
import java.net.URI;// URL
public class All_in_One
{
    public static void main () throws Exception 
   {
        System.out.println("\f");
        Scanner sc= new Scanner (System.in);//Scanner 
        Desktop d= Desktop.getDesktop();// desktop
        System.out.println("Subject:");
        System.out.println("");
        System.out.println("0-Random");
        System.out.println("1-English Literature");
        System.out.println("2-Hindi:");
        System.out.println("3-Physics");
        System.out.println("4-Chemistry");
        System.out.println("5-Biology");
        System.out.println("6-Math");
        System.out.println("7-History/Civics");
        System.out.println("8-Geography");
        System.out.println("9-English Language");
        System.out.println("10-Marathi");
                
        int subject= sc.nextInt();
        
        
        //random
       if (subject==0)
        {
            int n;
            Random r= new Random();
            n= r.nextInt(11);
            
            if (n==1)
             subject=1;
             else if (n==2)
             subject=2;
             else if (n==3)
             subject=3;
             else if (n==4)
             subject=4;
             else if (n==5)
             subject=5;
             else if (n==6)
             subject=6;
             else if (n==7)
             subject=7;
             else if (n==8)
             subject=8;
             else if (n==9)
             subject=9;
             else if (n==10)
             subject=10;
             else if (n==11)
             subject=11;
           }
        
        // Subject
        
       //English literature
       if (subject==1 )
        
         {
            System.out.println("\f");
            System.out.println("English Literature");
            System.out.println("Enter your choice");
            System.out.println("1-Treasure Chest");
            System.out.println("2-Julius Caesar");
            int chs= sc.nextInt();
            
            if (chs==1)
            {
              System.out.println("\f");
              System.out.println("English Literature:");
              System.out.println("Treasure Chest:");
              System.out.println("1-Story");  
              System.out.println("2-Poems");
              int tc= sc.nextInt();
              
              if (tc==1)
              {
                 System.out.println("\f");
                 System.out.println("English Literature:");
                 System.out.println("Treasure Chest");
                 System.out.println("Chapters:");
                 System.out.println("1. Bonku Babu's Friend");
                 System.out.println("2. Oliver Asks for more");
                 System.out.println("3. The Model Millionaire");
                 System.out.println("4. The Home-coming");
                 System.out.println("5. The Boy who Broke the Bank ");
                 System.out.println("6. The Migration (My Family and other Animals)");
                 System.out.println("7. Pandora's Box");
                 System.out.println("8. Gowramma's Letter");
                 System.out.println("9. The Wolves of Cernogratz");
                 System.out.println("10. A String of Beads-");
                 System.out.println("11. With the Photographer");
                 System.out.println("12. The Elevator");
                 System.out.println("13. The Girl Who Can");
                 System.out.println("14. The Pedestrian");
                 System.out.println("15. The Last Lesson");
                 System.out.println("16. Tom Loses a Tooth");
                 System.out.println("17. Ruthless ");
                 System.out.println("18. Womanspace in Tis Hazari");
                 System.out.println("19. The Blind Dog");
                 System.out.println("20. The Gift of the Magi");
                 int story=sc.nextInt();
                 if (story==1)
                 {
                     System.out.println("\f");
                     System.out.println("1. Bonku Babu's Friend");
                     d.browse(new URI("https://www.shouttolearn.org/2023/04/bonku-babus-friend-questions-answers.html"));
                 }// story1
                 else if (story==2)
                 {
                     System.out.println("\f");
                     System.out.println("2. Oliver Asks for more");
                     d.browse(new URI("https://www.shouttolearn.org/2023/04/oliver-asks-for-more-workbook-answers.html"));
                 }// story2
                 
                 else if (story==3)
                 {
                     System.out.println("\f");
                     System.out.println("3. The Model Millionaire");
                     d.browse(new URI("https://www.shouttolearn.org/2023/06/the-model-millionaire-workbook-solution.html"));
                 }// story3
                 else if (story==4)
                 {
                     System.out.println("\f");
                     System.out.println("4. The Home-coming");
                     d.browse(new URI("https://www.shouttolearn.org/2023/08/the-home-coming-workbook-answers.html"));
                 }// story4
                 else if (story==5)
                 {
                     System.out.println("\f");
                     System.out.println("5. The Boy who Broke the Bank ");
                     d.browse(new URI("https://www.shouttolearn.org/2023/07/the-boy-who-broke-bank-workbook-answers.html"));
                 }// story5
                 else if (story==6)
                 {
                     System.out.println("\f");
                     System.out.println("6. The Migration (My Family and other Animals)");
                     d.browse(new URI(""));
                 }// story6
                 else if (story==7)
                 {
                     System.out.println("\f");
                     System.out.println("7. Pandora's Box");
                     d.browse(new URI(""));
                 }// story7
                 else if (story==8)
                 {
                     System.out.println("\f");
                     System.out.println("8. Gowramma's Letter");
                     d.browse(new URI(""));
                 }// story8
                 else if (story==9)
                 {
                     System.out.println("\f");
                     System.out.println("9. The Wolves of Cernogratz");
                     d.browse(new URI(""));
                 }// story9
                 else if (story==10)
                 {
                     System.out.println("\f");
                     System.out.println("10. A String of Beads-");
                     d.browse(new URI(""));
                 }// story10
                 else if (story==11)
                 {
                     System.out.println("\f");
                     System.out.println("11. With the Photographer");
                     d.browse(new URI("https://onlinefreenotes.com/with-the-photographer/"));
                 }// story11
                 else if (story==12)
                 {
                     System.out.println("\f");
                     System.out.println("12. The Elevator");
                     d.browse(new URI("https://onlinefreenotes.com/the-elevator-icse-class-10/"));
                 }// story12
                 else if (story==13)
                 {
                     System.out.println("\f");
                     System.out.println("13. The Girl Who Can");
                     d.browse(new URI("https://onlinefreenotes.com/the-girl-who-can/"));
                 }// story13
                 else if (story==14)
                 {
                     System.out.println("\f");
                     System.out.println("14. The Pedestrian");
                     d.browse(new URI("https://onlinefreenotes.com/the-pedestrian-icse-10/"));
                 }// story14
                 else if (story==15)
                 {
                     System.out.println("\f");
                     System.out.println("15. The Last Lesson");
                     d.browse(new URI("https://onlinefreenotes.com/the-last-lesson/"));
                 }// story15
                 else if (story==16)
                 {
                     System.out.println("\f");
                     System.out.println("16. Tom Loses a Tooth");
                     d.browse(new URI(""));
                 }// story16
                 else if (story==17)
                 {
                     System.out.println("\f");
                     System.out.println("17. Ruthless ");
                     d.browse(new URI(""));
                 }// story17
                 else if (story==18)
                 {
                     System.out.println("\f");
                     System.out.println("18. Womanspace in Tis Hazari");
                     d.browse(new URI(""));
                 }// story18
                 else if (story==19)
                 {
                     System.out.println("\f");
                     System.out.println("19. The Blind Dog");
                     d.browse(new URI(""));
                 }// story19
                 else if (story==20)
                 {
                     System.out.println("\f");
                     System.out.println("20. The Gift of the Magi");
                     d.browse(new URI(""));
                 }// story20

                 

              }// Story
              
              else if(tc==2)
              {
                  System.out.println("\f");
                 System.out.println("English Literature:");
                 System.out.println("Treasure Chest");
                 System.out.println("poem:");
                 System.out.println("1. A Work of Artifice ");
                 System.out.println("2. Skimbleshanks: The Railway Cat");
                 System.out.println("3. I Remember, I Remember");
                 System.out.println("4. A Doctor's Journal Entry for August 6, 1945");
                 System.out.println("5. The Night Mail");
                 System.out.println("6. The Brook ");
                 System.out.println("7. On Killing a Tree");
                 System.out.println("8. The Village School Master");
                 System.out.println("9. My Mind to me a Kingdom is ");
                 System.out.println("10. A Poison Tree");
                 System.out.println("11. Haunted Houses");
                 System.out.println("12. The Glove and the Lions");
                 System.out.println("13. When Great Trees fall");
                 System.out.println("14. A Considerable Speck");
                 System.out.println("15. The Power of Music ");
                 System.out.println("16. King Porus");
                 System.out.println("17. The Cry of the Children ");
                 System.out.println("18. The Crocodile's Toothache");
                 System.out.println("19. The Hero");
                 System.out.println("20. The West Wind");
                 int poem= sc.nextInt();
                 
                 if (poem==1)
                 {
                     System.out.println("\f");
                     System.out.println("1. A Work of Artifice ");
                     d.browse(new URI("https://www.shouttolearn.org/2023/04/a-work-of-artifice-question-answers.html"));
                 }// poem1
                 else if (poem==2)
                 {
                     System.out.println("\f");
                     System.out.println("2. Skimbleshanks: The Railway Cat");
                     d.browse(new URI("https://www.shouttolearn.org/2023/04/skimbleshanks-railway-cat-workbook-solution.html"));
                 }// poem2
                 
                 else if (poem==3)
                 {
                     System.out.println("\f");
                     System.out.println("3. I Remember, I Remember");
                     d.browse(new URI("https://www.shouttolearn.org/2023/06/i-remember-i-remember-workbooks-answers.html"));
                 }// poem3
                 else if (poem==4)
                 {
                     System.out.println("\f");
                    System.out.println("4. A Doctor's Journal Entry for August 6, 1945");
                     d.browse(new URI("https://www.shouttolearn.org/2023/07/a-doctors-journal-entry-for-august-6.html"));
                 }// poem4
                 else if (poem==5)
                 {
                     System.out.println("\f");
                     System.out.println("5. The Night Mail");
                     d.browse(new URI("https://www.shouttolearn.org/2023/04/the-night-mail-question-answers.html"));
                 }// poem5
                 else if (poem==6)
                 {
                     System.out.println("\f");
                     System.out.println("6. The Brook ");
                     d.browse(new URI(""));
                 }// poem6
                 else if (poem==7)
                 {
                     System.out.println("\f");
                     System.out.println("7. On Killing a Tree");
                     d.browse(new URI(""));
                 }// poem7
                 else if (poem==8)
                 {
                     System.out.println("\f");
                     System.out.println("8. The Village School Master");
                     d.browse(new URI(""));
                 }// story8
                 else if (poem==9)
                 {
                     System.out.println("\f");
                     System.out.println("9. My Mind to me a Kingdom is ");
                     d.browse(new URI(""));
                 }// poem9
                 else if (poem==10 )
                 {
                     System.out.println("\f");
                     System.out.println("10. A Poison Tree");
                     d.browse(new URI(""));
                 }// poem10
                 else if (poem==11)
                 {
                     System.out.println("\f");
                     System.out.println("11. Haunted Houses");
                     d.browse(new URI("https://onlinefreenotes-com.translate.goog/haunted-houses-icse-10/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                 }// poem11
                 else if (poem==12)
                 {
                     System.out.println("\f");
                     System.out.println("12. The Glove and the Lions");
                     d.browse(new URI("https://onlinefreenotes-com.translate.goog/the-glove-and-the-lions/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                 }// poem12
                 else if (poem==13)
                 {
                     System.out.println("\f");
                     System.out.println("13. When Great Trees fall");
                     d.browse(new URI("https://onlinefreenotes-com.translate.goog/when-great-trees-fall/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                 }// story13
                 else if (poem==14)
                 {
                     System.out.println("\f");
                     System.out.println("14. A Considerable Speck");
                     d.browse(new URI("https://onlinefreenotes-com.translate.goog/a-considerable-speck/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                 }// poem14
                 else if (poem==15)
                 {
                     System.out.println("\f");
                     System.out.println("15. The Power of Music ");
                     d.browse(new URI("https://onlinefreenotes-com.translate.goog/the-power-of-music/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                 }// poem15
                 else if (poem==16)
                 {
                     System.out.println("\f");
                     System.out.println("16. King Porus");
                     d.browse(new URI(""));
                 }// poem16
                 else if (poem==17)
                 {
                     System.out.println("\f");
                     System.out.println("17. The Cry of the Children ");
                     d.browse(new URI(""));
                 }// poem17
                 else if (poem==18)
                 {
                     System.out.println("\f");
                     System.out.println("18. The Crocodile's Toothache");
                     d.browse(new URI(""));
                 }// poem18
                 else if (poem==19)
                 {
                     System.out.println("\f");
                     System.out.println("19. The Hero");
                     d.browse(new URI(""));
                 }// poem19
                 else if (poem==20)
                 {
                     System.out.println("\f");
                     System.out.println("20. The West wind");
                     d.browse(new URI(""));
                 }// poem20
              }//poem
            }// Treasure chest
            
            
            else if (chs==2)
            {
                System.out.println("\f");
                System.out.println("Julius Caesar");
                System.out.println("1-Act-I");
                System.out.println("2-Act-II");
                System.out.println("3-Act-III");
                System.out.println("4-Act-IV");
                System.out.println("5-Video summary");
                int act= sc.nextInt();
                if (act==1)
                {
                   System.out.println("\f");
                   System.out.println("Julius Caesar");
                   System.out.println("Act-I");
                   System.out.println("1- Scene 1");
                   System.out.println("2- Scene 2");
                   System.out.println("3- Scene 3");
                   int sce= sc.nextInt();
                   
                   if (sce==1)
                   {
                       System.out.println("\f");
                       System.out.println("Act I: Scene 1");
                       d.browse(new URI("https://onlinefreenotes-com.translate.goog/julius-caesar-act-1-scene-1/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                   }// scene 1
                   else if (sce==2)
                   {
                       System.out.println("\f");
                       System.out.println("Act I: Scene 2");
                       d.browse(new URI("https://onlinefreenotes-com.translate.goog/julius-caesar-act-1-scene-2/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                   }// scene 2
                   else if (sce==3)
                   {
                       System.out.println("\f");
                       System.out.println("Act I: Scene 3");
                       d.browse(new URI("https://onlinefreenotes-com.translate.goog/julius-caesar-act-1-scene-3/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                   }// scene 3
                   
                   
                   
                }// Act 1
                
                else if (act==2)
                {
                  System.out.println("\f");
                   System.out.println("Julius Caesar");
                   System.out.println("Act-II");
                   System.out.println("1- Scene 1");
                   System.out.println("2- Scene 2");
                   System.out.println("3- Scene 3");
                   System.out.println("4- Scene 4");
                   int sce= sc.nextInt();
                   
                   if (sce==1)
                   {
                       System.out.println("\f");
                       System.out.println("Act II: Scene 1");
                       d.browse(new URI("https://onlinefreenotes-com.translate.goog/julius-caesar-act-2-scene-1/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                   }// scene 1
                   else if (sce==2)
                   {
                       System.out.println("\f");
                       System.out.println("Act II: Scene 2");
                       d.browse(new URI("https://onlinefreenotes-com.translate.goog/julius-caesar-act-2-scene-2/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                   }// scene 2
                   else if (sce==3)
                   {
                       System.out.println("\f");
                       System.out.println("Act II: Scene 3");
                       d.browse(new URI("https://onlinefreenotes-com.translate.goog/julius-caesar-act-2-scene-3/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                   }// scene 3  
                   else if (sce==4)
                   {
                       System.out.println("\f");
                       System.out.println("Act II: Scene 4");
                       d.browse(new URI("https://onlinefreenotes-com.translate.goog/julius-caesar-act-2-scene-4/?_x_tr_sl=auto&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=wapp"));
                   }// scene 4
                   
                   
                }// Act 2
                
                else if (act==3)
                {
                   System.out.println("\f");
                   System.out.println("Julius Caesar");
                   System.out.println("Act-III");
                   System.out.println("1- Scene 1");
                   System.out.println("2- Scene 2");
                   System.out.println("3- Scene 3");
                   int sce= sc.nextInt();
                   
                   if (sce==1)
                   {
                       System.out.println("\f");
                       System.out.println("Act III: Scene 1");
                       d.browse(new URI("https://www.sparknotes.com/shakespeare/juliuscaesar/section6/"));
                   }// scene 1
                   else if (sce==2)
                   {
                       System.out.println("\f");
                       System.out.println("Act III: Scene 2");
                       d.browse(new URI("https://www.sparknotes.com/shakespeare/juliuscaesar/section7/"));
                   }// scene 2
                   else if (sce==3)
                   {
                       System.out.println("\f");
                       System.out.println("Act III: Scene 3");
                       d.browse(new URI("https://www.sparknotes.com/shakespeare/juliuscaesar/section7/"));
                   }// scene 3
                   
                   
                   
                }// Act 3
                
                else if (act==4)
                {
                    System.out.println("\f");
                    System.out.println("Julius Caesar");
                    System.out.println("Act IV Scene 1,2 and 3");
                    d.browse(new URI("https://www.sparknotes.com/shakespeare/juliuscaesar/section8/"));
                }//Act 4
                
                else if (act==5)
                {
                    System.out.println("\f");
                    System.out.println("Julius Caesar");
                    System.out.println("1.Video Summary");
                    System.out.println("2. Movie");
                    int mv= sc.nextInt();
                    System.out.println("\f");
                    if (mv==1)
                    d.browse(new URI("https://youtu.be/kgyAPrv30eg?feature=shared"));
                    else if (mv==2)
                    d.browse(new URI("https://youtu.be/nWBzAuZASS8?feature=shared"));
                }// Act 5
            }// Julis Caesar
        }// enlish literature
        
        
        
        //hindi
        
        else if(subject==2 )
        {
          System.out.println("\f");
          System.out.println("हिन्दी ");
          System.out.println("1. साहित्य सागर ");
          System.out.println(" 2. एकांकी संचय ");
          int chs=sc.nextInt();
          
          if (chs==1)
          {
              System.out.println("\f");
              System.out.println("हिन्दी ");
              System.out.println("साहित्य सागर ");
              System.out.println("");
              System.out.println("1. बात अठन्नी की");
              System.out.println("2. काकी");
              System.out.println("3. महायज्ञ का पुरस्कार");
              System.out.println("4. नेताजी का चश्मा");
              System.out.println("5. अपना-अपना भाग्य");
              System.out.println("6. बड़े घर की बेटी");
              System.out.println("7. संदेह");
              System.out.println("8. भीड़ में खोया आदमी");
              System.out.println("9. भेड़ें और भेड़िए");
              System.out.println("10. दो कलाकार ");
              int chss=sc.nextInt();
              
              if (chss==1)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("1. बात अठन्नी की");
                
                 if (sv==1)
                 d.browse(new URI("https://www.shouttolearn.org/2022/01/baat-athani-ki-workbook-solution.html"));
                 else if (sv==2)
                 d.browse (new URI("https://youtu.be/w38kHSQ15i0?feature=shared"));
             
                }//ss1
              
              else if (chss==2)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("2. काकी");
                
                 if (sv==1)
                 d.browse(new URI("https://www.shouttolearn.org/2022/01/kaki-question-answers.html"));
                 else if (sv==2)
                  d.browse (new URI("https://youtube.com/watch?v=tiknD6GNAMs&feature=shared"));
                 
              }//ss2
              
              else if (chss==3 )
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("3. महायज्ञ का पुरस्कार");
                
                  if (sv==1)
                  d.browse(new URI("https://www.shouttolearn.org/2021/11/mahayagya-ka-purashkar-workbook-solution.html"));
                  else if (sv==2)
                  d.browse (new URI("https://youtube.com/watch?v=K_SrmUTeano&feature=shared"));
                
                }//ss3
              
              else if (chss==4)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("4. नेताजी का चश्मा");
                
                  if (sv==1)
                  d.browse(new URI("https://www.shouttolearn.org/2021/09/neta-ji-ka-chasma-workbook-answers.html"));
                  else if (sv==2)
                  d.browse (new URI("https://youtube.com/watch?v=YrTjuX8IFLQ&feature=shared"));
                
                }//ss4
              
              else if (chss==5)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("5. अपना-अपना भाग्य");
                
                  if (sv==1)
                  d.browse(new URI("https://www.shouttolearn.org/2021/12/apna-apna-bhagya-workbook-answers.html"));
                  else if (sv==2)
                  d.browse (new URI("https://youtube.com/watch?v=7FLw6QBvSBE&feature=shared"));
                
                }//ss5
              
              else if (chss==6)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("6. बड़े घर की बेटी");
                
                
                  if (sv==1)
                  d.browse(new URI("https://www.shouttolearn.org/2021/12/bade-ghar-ki-beti-workbook-answer.html"));
                  else if (sv==2)
                  d.browse (new URI("https://youtu.be/JlL_KHQujUk?si=zCdMo9Gly9aM9H9I"));
                
                }//ss6
              
              else if (chss==7)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("7. संदेह");
                
                
                  if (sv==1)
                  d.browse(new URI("https://www.shouttolearn.org/2022/02/sandeh-workbook-questions-answers.html"));
                  else if (sv==2)
                  d.browse (new URI("https://youtu.be/oMsJoAgrsso?si=8O0QGz9jV27QJSFG"));
                
                
                
                }//ss7
              
              else if (chss==8)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("8. भीड़ में खोया आदमी");
                
                  if (sv==1)
                  d.browse(new URI("https://www.shouhttps://www.shouttolearn.org/2022/02/sandeh-workbook-questions-answers.htmlttolearn.org/2022/07/bhid-me-khoya-aadmi-question-answers.html"));
                  else if (sv==2)
                  d.browse (new URI("https://youtube.com/watch?v=CyaxeNZG31E&feature=shared/"));
                
                }//ss8
              
              else if (chss==9)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("9. भेड़ें और भेड़िए");
                
                  if (sv==1)
                  d.browse(new URI("https://www.shouttolearn.org/2023/01/bhed-aur-bhediye-question-answers.html"));
                  else if (sv==2)
                  d.browse (new URI("https://youtu.be/UMEWzJ5_azQ?si=Y8bb6iSbUfenwQT1"));
              }//ss9
              
              else if (chss==10)
              {
                System.out.println("\f");
                System.out.println("1-Solution");
                System.out.println("2-video");
                int sv= sc.nextInt();
                System.out.println("\f");
                System.out.println("हिन्दी ");
                System.out.println("साहित्य सागर ");
                System.out.println("10. दो कलाकार ");
                
                
                  if (sv==1)
                  d.browse(new URI("https://www.shouttolearn.org/2023/01/do-kalakar-question-answers.html"));
                  else if (sv==2)
                  d.browse (new URI("https://youtu.be/_QU87FqmEJY?si=-8clic-ita8zf5va"));
              }//ss10
            }//sahitya sagar
              
            else if (chs==2)
              {
                  // System.out.println("\f");
                  System.out.println("हिन्दी ");
                  System.out.println("एकांकी संचय ");
                  System.out.println("");
                  System.out.println("1. संस्कार और भावना");
                  System.out.println("2. बहू की विदा");
                  System.out.println("3. मातृभूमि का मान");
                  System.out.println("4. सूखी डाली");
                  System.out.println("5. महाभारत की एक साँझ");
                  System.out.println("6. दीपदान");
                  int ches=sc.nextInt();
                  
                  if (ches==1)
                  {
                      System.out.println("\f");
                      System.out.println("1-Solution");
                      System.out.println("2-video");
                      int sv= sc.nextInt();
                      System.out.println("हिन्दी ");
                      System.out.println("एकांकी संचय ");
                      System.out.println("1. संस्कार और भावना");
                      
                      
                          if (sv==1)
                          d.browse(new URI("https://www.shouttolearn.com/2021/10/workbook-answers-of-sanskar-aur-bhavna.html"));
                          else if(sv==2)
                          d.browse(new URI("https://youtu.be/eJtuo5DTDSg?si=_9PR5hrdK7JpeRSM"));
                        
                        }//es1
                  
                  else if (ches==2)
                  {
                      System.out.println("\f");
                      System.out.println("1-Solution");
                      System.out.println("2-video");
                      int sv= sc.nextInt();
                      System.out.println("हिन्दी ");
                      System.out.println("एकांकी संचय ");
                      System.out.println("2. बहू की विदा");
                      
                          if(sv==1)
                          d.browse(new URI("https://www.shouttolearn.com/2021/10/workbook-answers-of-bahu-ki-vida-ekanki.html"));
                          else if(sv==2)
                          d.browse(new URI("https://youtu.be/KaJjk2p2l2M?si=2LEwz-k5otkvA5Hj"));
                        
                        }//es2
                  
                  else if (ches==3)
                  {
                      System.out.println("\f");
                      System.out.println("1-Solution");
                      System.out.println("2-video");
                      int sv= sc.nextInt();
                      System.out.println("हिन्दी ");
                      System.out.println("एकांकी संचय ");
                      System.out.println("3. मातृभूमि का मान");
                      
                      
                          if (sv==1)
                          d.browse(new URI("https://www.shouttolearn.com/2021/10/workbook-answers-of-matribhumi-ka-maan.html"));
                          else if(sv==2)
                          d.browse(new URI("https://youtu.be/tOPd7DFokhs?si=dGsRpApkHfD_ZMBN"));
                        
                        }//es3
                  
                  else if (ches==4)
                  {
                      System.out.println("\f");
                      System.out.println("1-Solution");
                      System.out.println("2-video");
                      int sv= sc.nextInt();
                      System.out.println("हिन्दी ");
                      System.out.println("एकांकी संचय ");
                      System.out.println("4. सूखी डाली");
                      
                          if (sv==1)
                          d.browse(new URI("https://www.shouttolearn.com/2021/10/workbook-answers-of-sukhi-daali-ekanki.html"));
                          else if(sv==2)
                          d.browse(new URI("https://youtube.com/watch?v=s_Huv4YoOAw&feature=shared"));
                          
                        
                        }//es4
                  
                  else if (ches==5)
                  {
                      System.out.println("\f");
                      System.out.println("1-Solution");
                      System.out.println("2-video");
                      int sv= sc.nextInt();
                      System.out.println("हिन्दी ");
                      System.out.println("एकांकी संचय ");
                      System.out.println("5. महाभारत की एक साँझ");
                      
                      
                          if (sv==1)
                          d.browse(new URI("https://www.shouttolearn.com/2021/10/workbook-answers-of-mahabharat-ki-ek-sanjh.html"));
                          else if(sv==2)
                          d.browse(new URI("https://youtu.be/pszWMxOJrX4?si=EFHIrR_DOV5QPvIO"));
                    
                    }//es5
                  
                  else if (ches==6)
                  {
                      System.out.println("\f");
                      System.out.println("1-Solution");
                      System.out.println("2-video");
                      int sv= sc.nextInt();
                      System.out.println("हिन्दी ");
                      System.out.println("एकांकी संचय ");
                      System.out.println("6. दीपदान");
                      
                        if(sv==1)
                        d.browse(new URI("https://www.shouttolearn.com/2022/01/workbook-answers-of-deepdan-ekanki.html"));
                        else if(sv==2)
                        d.browse(new URI("https://youtu.be/lwQjHhvoBfY?si=pDPN0Fyg9jQe8H9L"));
                    }//es6
              }//ekanki sanchay
          
        }//hindi
        
        
    
        // phy
         else if (subject==3 )
        {
             System.out.println("\f");
             System.out.println("Physics");
             System.out.println("");
             System.out.println("1. Measurements and Experimentation");
             System.out.println("2. Motion in One Dimension");
             System.out.println("3. Laws of Motion");
             System.out.println("4. Pressure in Fluids and Atmospheric Pressure");
             System.out.println("5. Upthrust in Fluids, Archimedes' Principle and Floatation");
             System.out.println("6. Heat and Energy");
             System.out.println("7. Reflection of Light");
             System.out.println("8. Propagation of Sound Waves");
             System.out.println("9. Current Electricity");
             System.out.println("10. Magnetism");
             int chs=sc.nextInt();
             
             if (chs==1)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("1. Measurements and Experimentation");
                 System.out.println("");
                 System.out.println("1- Solution");
                 System.out.println("2- Unit convertor");
                 int sp= sc.nextInt();
                 
                   if (sp==1)
                   d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/XgnNl/measurements-experimentation"));
                   else if (sp==2)
                   d.browse (new URI("https://www.unitconverters.net/"));
             }// chp1
             
             else if (chs==2)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("2. Motion in One Dimension");
                 System.out.println("");
                 System.out.println("1- Solution");
                 System.out.println("2- Solve problem");
                 int sp= sc.nextInt();
                 
                   if (sp==1)
                   d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/XlWZe/motion-one-dimension"));
                   else if (sp==2)
                   d.browse (new URI("https://www.calculatorsoup.com/calculators/physics/uniformly-accelerated-motion-calculator.php"));
             }// chp2
             
             else if (chs==3)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("3. Laws of Motion");
                 System.out.println("");
                 System.out.println("1- Solution");
                 System.out.println("2- Momentum calculator");
                 System.out.println("3- Newtons second law calculator");
                 System.out.println("4- Gravitational force calculator");
                 int sp= sc.nextInt();
                 
                   if (sp==1)
                   d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/XvR4e/laws-motion"));
                   else if (sp==2)
                   d.browse (new URI("https://www.omnicalculator.com/physics/momentum"));
                   else if (sp==3)
                   d.browse (new URI("https://www.omnicalculator.com/physics/newtons-second-law"));
                   else if (sp==4)
                   d.browse (new URI("https://www.omnicalculator.com/physics/gravitational-force"));
             }// chp3
             
             else if (chs==4)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("4. Pressure in Fluids and Atmospheric Pressure");
                 System.out.println("");
                 System.out.println("1- Solution");
                 System.out.println("2- Fluid pressure calculator");
                 int sp= sc.nextInt();
                 
                   if (sp==1)
                   d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/Xl64M/pressure-atmospheric-fluids"));
                   else if (sp==2)
                   d.browse (new URI("https://www.omnicalculator.com/physics/hydrostatic-pressurec c"));
             }// chp4
             
             else if (chs==5)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                  System.out.println("5. Upthrust in Fluids, Archimedes' Principle and Floatation");
                 System.out.println("");
                 System.out.println("1- Solution");
                 System.out.println("2- Upthrust in Fluid calculator");
                 System.out.println("3- Density calculator");
                 System.out.println("4- Relative density calculator");
                 System.out.println("5- Archimedes' principle calculator");
                 int sp= sc.nextInt();
                 
                   if (sp==1)
                   d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/X3wgJ/archimedes-principle-upthrust"));
                   else if (sp==2)
                   d.browse (new URI("https://www.omnicalculator.com/physics/buoyant-force"));
                   else if (sp==3)
                   d.browse (new URI("https://www.calculatorsoup.com/calculators/physics/density.php"));
                   else if (sp==4)
                   d.browse (new URI("https://www.calculatoratoz.com/en/relative-density-calculator/Calc-1101"));
                   else if (sp==5)
                   d.browse (new URI("https://www.omnicalculator.com/physics/archimedes-principle"));
                   
             }// chp5
             else if (chs==6)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("6. Heat and Energy");
                 d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/XK33W/heat-energy"));
             }// chp6
             else if (chs==7)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("7. Reflection of Light");
                 System.out.println("");
                 System.out.println("1- Solution");
                 System.out.println("2- Mirror and magnification calculator");
                 int sp= sc.nextInt();
                 
                   if (sp==1)
                   d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/R1q9j/reflection-light"));
                   else if (sp==2)
                   d.browse (new URI("https://www.omnicalculator.com/physics/mirror-equation"));
             }// chp7
             else if (chs==8)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("8. Propagation of Sound Waves");
                 System.out.println("");
                 System.out.println("1- Solution");
                 System.out.println("2- Wave calculator");
                 int sp= sc.nextInt();
                 
                   if (sp==1)
                   d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/XvopM/sound-waves-propagation"));
                   else if (sp==2)
                   d.browse (new URI("https://www.omnicalculator.com/physics/wavelength"));
             }// chp8
             else if (chs==9)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("9. Current Electricity");
                 System.out.println("");
                 System.out.println("1- Solution");
                 System.out.println("2- Current calculator");
                 System.out.println("3- Ohm's law calculator");
                 
                 int sp= sc.nextInt();
                 
                   if (sp==1)
                   d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/XoQkD/current-electricity"));
                   else if (sp==2)
                   d.browse (new URI("https://dipslab.com/current-calculator/"));
                   else if (sp==3)
                   d.browse (new URI("https://www.calculator.net/ohms-law-calculator.html"));
                   
                   
             }// chp9
             else if (chs==10)
             {
                 System.out.println("\f");
                 System.out.println("Physics");
                 System.out.println("10. Magnetism");
                 d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-physics-selina/solutions/X6VYM/magnetism"));
             }// chp10
             
            
        }//physics
        
        // chem
        else if (subject==4 )
        {
            System.out.println("\f");
            System.out.println("Chemisty");
            System.out.println("");
            System.out.println("1. THE LANGUAGE OF CHEMISTRY");
            System.out.println("2. CHEMICAL CHANGES & REACTIONS");
            System.out.println("3. WATER");
            System.out.println("4. ATOMIC STRUCTURE & CHEMICAL BONDING");
            System.out.println("5. THE PERIODIC TABLE");
            System.out.println("6. STUDY OF THE FIRST ELEMENT");
            System.out.println("7. STUDY OF GAS LAWS");
            System.out.println("8. ATMOSPHERIC POLLUTION");
            System.out.println("9. PRACTICAL CHEMISTY");
            int chs=sc.nextInt();
            
            if (chs==1)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("1. THE LANGUAGE OF CHEMISTRY");
                System.out.println("");
                System.out.println("1- Solution");
                System.out.println("2- Valency Chart");
                System.out.println("3- Important compound");
                int chc= sc.nextInt();
                
                 if (chc==1)
                 d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/bNGQ3/language-chemistry"));
                 else if (chc==2)
                 d.browse (new URI("https://www.thoughtco.com/valences-of-the-elements-chemistry-table-606458"));
                 else if (chc==3)
                 d.browse (new URI("https://byjus.com/chemical-compound-formulas/"));
                
            }// chc
            
            else if (chs==2)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("2. CHEMICAL CHANGES & REACTIONS");
                System.out.println("");
                System.out.println("1- Solution");
                System.out.println("2- Balance Chemical Equation and Reaction Type");
                int chc= sc.nextInt();
                
                 if (chc==1)
                 d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/Wz5qm/chemical-changes"));
                 else if (chc==2)
                 d.browse (new URI("https://www.webqc.org/balance.php"));
                
            }// chc 2
            else if (chs==3)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("3. WATER");
                d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/DOPNd/water"));
                
            }// chc3
            else if (chs==4)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("4. ATOMIC STRUCTURE & CHEMICAL BONDING");
                System.out.println("");
                System.out.println("1- Solution");
                System.out.println("2- Structure of Elements in Periodic Table");
                int chc= sc.nextInt();
                
                 if (chc==1)
                 d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/bkE0K/chemical-bonding"));
                 else if (chc==2)
                 d.browse (new URI("https://artsexperiments.withgoogle.com/periodic-table/"));
                
            }// chc4
            else if (chs==5)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("5. THE PERIODIC TABLE");
                System.out.println("");
                System.out.println("1- Solution ");
                System.out.println("2- Periodic Table");
                System.out.println("3- Periodic Properties and Trend");
                int chc= sc.nextInt();
                
                 if (chc==1)
                 d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/b2MVY/periodic-table"));
                 else if (chc==2)
                 {
                     System.out.println("\f");
                     System.out.println("Chemisty");
                     System.out.println("5. THE PERIODIC TABLE");
                     System.out.println("~~~Periodic table~~~");
                     System.out.println("");
                     System.out.println("1. Periodic table elements information");
                     System.out.println("2. Game");
                     int pt= sc.nextInt();
                     
                         if(pt==1)
                         {
                           d.browse (new URI("https://pubchem.ncbi.nlm.nih.gov/periodic-table/#view=table"));
                           d.browse (new URI("https://www.webqc.org/periodictable.php"));
                        }
                         else if(pt==2)
                         d.browse (new URI("https://pubchem.ncbi.nlm.nih.gov/periodic-table/#view=game"));
                                          
                 }//periodic table
                 
                 else if (chc==3)
                 d.browse (new URI("https://chem.libretexts.org/Bookshelves/Inorganic_Chemistry/Supplemental_Modules_and_Websites_(Inorganic_Chemistry)/Descriptive_Chemistry/Periodic_Trends_of_Elemental_Properties/Periodic_Trends"));
                
            }// chc5
            else if (chs==6)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("6. STUDY OF THE FIRST ELEMENT");
                d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/b4r4r/hydrogen-study"));
                
            }// chc6
            else if (chs==7)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("7. STUDY OF GAS LAWS");
                System.out.println("");
                System.out.println("1- Solution");
                System.out.println("2- Gas laws equations");
                int chc= sc.nextInt();
                
                 if (chc==1)
                 d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/bev9L/gas-laws-study"));
                 else if (chc==2)
                 d.browse (new URI("https://www.webqc.org/gaslaws.php"));
                
            }// chc7
            else if (chs==8)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("8. ATMOSPHERIC POLLUTION");
                d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/bv7d4/atmospheric-pollution"));
                
            }// chc8
            else if (chs==9)
            {
                System.out.println("\f");
                System.out.println("Chemisty");
                System.out.println("9. PRACTICAL CHEMISTY");
                d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-dalal-simplified-chemistry/solutions/g7013/practical-chemistry"));
                
            }// chc9

         }//chemisty
        
        //Bio
          else if (subject==5 )
        {
              System.out.println("\f");
              System.out.println("Biology");  
              System.out.println("");
              System.out.println("1. Introducing Biology");
              System.out.println("2. Cell: The Unit of Life");
              System.out.println("3. Tissues: Plant and Animal Tissues");
              System.out.println("4. The Flowe");
              System.out.println("5. Pollination and Fertilization");
              System.out.println("6. Seeds-Structure and Germination");
              System.out.println("7. Respiration in Plants");
              System.out.println("8. Five Kingdom Classification");
              System.out.println("9. Economic Importance of Bacteria and Fungi");
              System.out.println("10. Nutrition");
              System.out.println("11. Digestive System");
              System.out.println("12. Skeleton-Movement and Locomotion");
              System.out.println("13. Skin- The Jack of All Trades");
              System.out.println("14. The Respiratory System");
              System.out.println("15. Hygiene [A Key to Healthy Life]");
              System.out.println("16. Diseases: Cause and Control");
              System.out.println("17. Aids to Health");
              System.out.println("18. Health Organisations");
              System.out.println("19. Waste Generation and Management");
              int chs= sc.nextInt();
              
              if (chs==1)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("1. Introducing Biology");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vnvrz/biology-intro"));
                    
                }// chb1
                
              else if (chs==2)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("2. Cell: The Unit of Life");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vG7Y4/cell-life-unit"));
                    
                }// chb2
              else if (chs==3)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("3. Tissues: Plant and Animal Tissues");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/v411P/plant-animal-tissues"));
                    
                }// chb3
              else if (chs==4)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("4. The Flowe");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/v85My/flower"));
                    
                }// chb4
              else if (chs==5)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("5. Pollination and Fertilization");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vA3EO/pollination-fertilization"));
                    
                }// chb5
                else if (chs==6)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("6. Seeds-Structure and Germination");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vWbbk/seeds-structure-germination"));
                    
                }// chb6
                else if (chs==7)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("7. Respiration in Plants");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vBR5p/plants-respiration"));
                    
                }// chb7
                else if (chs==8)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("8. Five Kingdom Classification");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vdlOQ/five-kingdom-classification"));
                    
                }// chb8
                else if (chs==9)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                     System.out.println("9. Economic Importance of Bacteria and Fungi");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vP4Gw/bacteria-economic-importance"));
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vJW9K/fungi-economic-importance"));
                }// chb9
                else if (chs==10)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("10. Nutrition");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vzJny/nutrition"));
                    
                }// chb10
                else if (chs==11)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("11. Digestive System");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vLn6O/digestive-system"));
                    
                }// chb11
                else if (chs==12)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("12. Skeleton-Movement and Locomotion");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/v52l4/skeleton"));
                    
                }// chb12
                else if (chs==13)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("13. Skin- The Jack of All Trades");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/q5MQp/skin"));
                    
                }// chb13
                else if (chs==14)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("14. The Respiratory System");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vkoPQ/respiratory-system"));
                    
                }// chb14
                else if (chs==15)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("15. Hygiene [A Key to Healthy Life]");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/voQ7w/hygiene"));
                    
                }// chb15
                else if (chs==16)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                     System.out.println("16. Diseases: Cause and Control");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vvKvW/diseases-cause-control"));
                    
                }// chb16
                else if (chs==17)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("17. Aids to Health");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vldqy/health-aids"));
                    
                }// chb17
                else if (chs==18)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("18. Health Organisations");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/vGgek/health-organisations"));
                    
                }// chb18
                else if (chs==19)
                {
                    System.out.println("\f");
                    System.out.println("Biology");
                    System.out.println("19. Waste Generation and Management");
                    d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-concise-biology-selina/solutions/v41mp/waste-generation-management"));
                    
                }// chb19
              
            }//biology
        
        //math
         else if (subject==6 )
        {
           System.out.println("\f");
           System.out.println("Math"); 
           System.out.println("");
           System.out.println("1. Rational and Irrational Numbers");
           System.out.println("2. Compound Interest");
           System.out.println("3. Expansions");
           System.out.println("4. Factorisation");
           System.out.println("5. Simultaneous Linear Equations");
           System.out.println("6. Problems on Simultaneous Linear Equations");
           System.out.println("7. Quadratic Equations");
           System.out.println("8. Indices");
           System.out.println("9. Logarithms");
           System.out.println("10. Triangles");
           System.out.println("11. Mid-point Theorem");
           System.out.println("12. Pythagoras Theorem");
           System.out.println("13. Rectilinear Figures");
           System.out.println("14. Theorems on Area");
           System.out.println("15. Circle");
           System.out.println("16. Mensuration");
           System.out.println("17. Trigonometrical Ratios");
           System.out.println("18. Trigonometrical Ratios of Standard Angles");
           System.out.println("19. Coordinate Geometry");
           System.out.println("20. Statistics");
           int chs=sc.nextInt();
           
           
           if (chs==1)
            {
                System.out.println("\f");
                System.out.println("Math");
                System.out.println("1. Rational and Irrational Numbers");
                System.out.println("");
                System.out.println("1- Solution");
                System.out.println("2- ");
                int chc= sc.nextInt();
                
                 if (chc==1)
                 d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-1/Rational-And-Irrational-Numbers/1350/112"));
                 else if (chc==2)
                 d.browse (new URI(""));
                
            }// chm1
            else if (chs==2)
            {
                System.out.println("\f");
                System.out.println("Math");
                System.out.println("2. Compound Interest");
                System.out.println("");
                System.out.println("1- Solution");
                System.out.println("2- ");
                int chc= sc.nextInt();
                
                 if (chc==1)
                 d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-2/Compound-Interest/1351/112"));
                 else if (chc==2)
                 d.browse (new URI("https://www.calculatorsoup.com/calculators/financial/compound-interest-calculator.php"));
                
            }// chm2
            else if (chs==3)
            {
                System.out.println("\f");
                System.out.println("Math");
                System.out.println("3. Expansions");
                System.out.println("");
                System.out.println("1- Solution");
                System.out.println("2- Expand the terms");
                int chc= sc.nextInt();
                
                 if (chc==1)
                 d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-3/Expansions/1352/112"));
                 else if (chc==2)
                 d.browse (new URI("https://quickmath.com/webMathematica3/quickmath/algebra/expand/basic.jsp"));
                
            }// chm3
            else if (chs==4)
            {
                System.out.println("\f");
                System.out.println("Math");
                System.out.println("4. Factorisation");
                System.out.println("");
                System.out.println("1- Solution");
                    System.out.println("2- Factorise the term");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-6/Problem-on-Simultaneous-Linear-Equations/1355/112"));
                     else if (chc==2)
                     d.browse (new URI("https://www.mathpapa.com/factoring-calculator/"));
                    
                }// chm4
                else if (chs==5)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("5. Simultaneous Linear Equations");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Solve the simultaneous linear equations");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-5/Simultaneous-Linear-Equations/1354/112"));
                     else if (chc==2)
                     d.browse (new URI("https://www.wolframalpha.com/calculators/system-equation-calculator"));  
                    
                }// chm5
                else if (chs==6)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("6. Problems on Simultaneous Linear Equations");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Solve the simultaneous linear equations");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-6/Problem-on-Simultaneous-Linear-Equations/1355/112"));
                     else if (chc==2)
                     d.browse (new URI("https://www.wolframalpha.com/calculators/system-equation-calculator"));
                    
                }// chm6
                
                else if (chs==7)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("7. Quadratic Equations");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Quadratic Equation Solver");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-7/Quadratic-Equations/1356/112"));
                     else if (chc==2)
                     {
                        System.out.println ("Enter coefficient of x^2");
                        double a = sc.nextDouble();
                        System.out.println ("Enter coefficient of x");
                        double b = sc. nextDouble();
                        System.out.println("Enter constant");
                        double c= sc.nextDouble(); 
                        double r1= (-b + Math.sqrt(b*b -4*a*c))/2*a;
                        double r2= (-b - Math.sqrt(b*b -4*a*c))/2*a;
                        System.out.println ("Roots of Quadratic Equation=" + r1+ " , "+r2);
                      } 
                    
                }// chm7
                else if (chs==8)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("8. Indices");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Indices calculators");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-8/Indices/1357/112"));
                     else if (chc==2)
                     {
                       d.browse (new URI("https://quickmath.com/webMathematica3/quickmath/algebra/expand/basic.jsp"));
                       d.browse (new URI("https://www.mathpapa.com/factoring-calculator/"));
                     }
                    
                }// chm8
                else if (chs==9)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("9. Logarithms");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Log calculator ");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-9/Logarithms/1358/112"));
                     else if (chc==2)
                     d.browse (new URI("https://www.rapidtables.com/calc/math/Log_Calculator.html"));
                    
                }// chm9
                else if (chs==10)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("10. Triangles");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Calculate area of triangle");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-10/Triangles/1359/112"));
                     else if (chc==2)
                     {
                       d.browse (new URI("https://www.omnicalculator.com/math/area-triangle-coordinates"));
                       d.browse (new URI("https://www.omnicalculator.com/math/triangle-area"));
                       d.browse (new URI("https://www.omnicalculator.com/math/herons-formula"));
                     }
                    
                }// chm10
                else if (chs==11)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                     System.out.println("11. Mid-point Theorem");
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-11/Mid-Point-Theorem/1360/112"));
                    
                }// chm11
                else if (chs==12)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("12. Pythagoras Theorem");
                    d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-12/Pythagoras-Theorem/1361/112"));
                                     
                }// chm12
                else if (chs==13)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("13. Rectilinear Figures");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Area calculator");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-13/Rectilinear-Figures/1362/112"));
                     else if (chc==2)
                     d.browse (new URI("https://www.calculator.net/area-calculator.html"));
                    
                }// chm13
                else if (chs==14)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                     System.out.println("14. Theorems on Area");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Area calculator");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-14/Theorems-on-Area/1363/112"));
                     else if (chc==2)
                     d.browse (new URI("https://www.calculator.net/area-calculator.html"));
                    
                }// chm14
                else if (chs==15)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("15. Circle");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Area of circle");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-15/Circle/1364/112"));
                     else if (chc==2)
                     d.browse (new URI("https://www.calculator.net/circle-calculator.html/"));
                    
                }// chm15
                else if (chs==16)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("16. Mensuration");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Mensurational's shape calculator");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-16/Mensuration/1365/112"));
                     else if (chc==2)
                     {
                       d.browse (new URI("https://www.calculator.net/area-calculator.html"));
                       d.browse (new URI("https://www.calculator.net/circle-calculator.html/"));
                       d.browse (new URI("https://www.gigacalculator.com/calculators/perimeter-calculator.php"));
                       d.browse (new URI("https://www.calculator.net/surface-area-calculator.html"));
                       d.browse (new URI("https://www.calculator.net/volume-calculator.html"));
                       d.browse (new URI("https://www.omnicalculator.com/math/area-triangle-coordinates"));
                       d.browse (new URI("https://www.omnicalculator.com/math/triangle-area"));
                       d.browse (new URI("https://www.omnicalculator.com/math/herons-formula"));
                      }
                      
                }// chm16
                else if (chs==17)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("17. Trigonometrical Ratios");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Trignometric calculator");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-17/Trigonometric-Ratios/1366/112"));
                     else if (chc==2)
                     d.browse (new URI("https://mathsolver.microsoft.com/en/trigonometry-calculator"));
                    
                }// chm17
                else if (chs==18)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("18. Trigonometrical Ratios of Standard Angles");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Trignometric calculator");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-18/Trigonometric-Ratios-and-Standard-Angle/1367/112"));
                     else if (chc==2)
                     d.browse (new URI("https://mathsolver.microsoft.com/en/trigonometry-calculator"));
                    
                }// chm18
                else if (chs==19)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("19. Coordinate Geometry");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Coordinate geometry plotter");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-19/Coordinate-Geometry/1368/112"));
                     else if (chc==2)
                     {
                      d.browse (new URI("https://www.geogebra.org/graphing?lang=en"));
                      d.browse (new URI("https://www.omnicalculator.com/math/area-triangle-coordinates"));
                      
                     }
                    
                }// chm19
                else if (chs==20)
                {
                    System.out.println("\f");
                    System.out.println("Math");
                    System.out.println("20. Statistics");
                    System.out.println("");
                    System.out.println("1- Solution");
                    System.out.println("2- Mean_Median_Mode Calculator ");
                    int chc= sc.nextInt();
                    
                     if (chc==1)
                     d.browse (new URI("https://praadisedu.com/ml-aggarwal-solutions-for-class-9-Mathematics-chapter-20/Statistics/1369/112"));
                     else if (chc==2)
                     d.browse (new URI("https://www.calculatorsoup.com/calculators/statistics/mean-median-mode.php"));
                    
                }// chm20
              
               
               
            }//Math
            
            //his/civ
            else if (subject==7 )
            {
                System.out.println("\f");
                System.out.println("History and Civics");
                System.out.println("");
                System.out.println("1- History");
                System.out.println("2- Civics");
                int chs=sc.nextInt();
                
                if (chs==1)
                {
                    System.out.println("\f");
                    System.out.println("History");
                    System.out.println("");
                    System.out.println("1. The Harappan Civilisation");
                    System.out.println("2. The Vedic Period");
                    System.out.println("3. Jainism and Buddhism");
                    System.out.println("4. The Mauryan Empire");
                    System.out.println("5. The Sangam Age");
                    System.out.println("6. The Age of the Guptas");
                    System.out.println("7. Medieval India (A) The Cholas");
                    System.out.println("8. Medieval India (B) The Delhi Sultanate");
                    System.out.println("9. Medieval India (C) The Mughal Empire");
                    System.out.println("10. Medieval India (D) Composite Culture");
                    System.out.println("11. The Modern Age in Europe (A) Renaissance");
                    System.out.println("12. The Modern Age in Europe (B) Reformation");
                    System.out.println("13. The Modern Age in Europe (C) Industrial Revolution");
                    int chh= sc.nextInt();
                    
                    if (chh== 1)
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("1. The Harappan Civilisation");
                        d.browse(new URI("https://knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yvQV3/harappan-civilisation"));
                    }//chh1
                    
                    else if (chh==2 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                         System.out.println("2. The Vedic Period");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/ZwPxm/vedic-period"));
                    }//chh2
                    
                    else if (chh==3 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("3. Jainism and Buddhism");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/DD5nd/jainism-buddhism"));
                    }//chh3
                    
                    else if (chh==4 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("4. The Mauryan Empire");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yQyqQ/mauryan-empire"));
                    }//chh4
                    
                    else if (chh==5 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("5. The Sangam Age");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yeeNg/sangam-age"));
                    }//chh5
                    
                    else if (chh==6 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("6. The Age of the Guptas");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yPyAQ/gupta-age"));
                    }//chh6
                    
                    else if (chh==7 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                         System.out.println("7. Medieval India (A) The Cholas");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yw9Og/cholas"));
                    }//chh7
                    
                    else if (chh==8 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("8. Medieval India (B) The Delhi Sultanate");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yw9Og/cholas"));
                    }//chh8
                    
                    else if (chh==9 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("9. Medieval India (C) The Mughal Empire");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yDj73/mughal-empire"));
                    }//chh9
                    
                    else if (chh==10 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("10. Medieval India (D) Composite Culture");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yOBV2/composite-culture"));
                    }//chh10
                    
                    else if (chh==11 )
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("11. The Modern Age in Europe (A) Renaissance");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yrkqg/renaissance"));
                    }//chh11
                    
                    else if (chh== 12)
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("12. The Modern Age in Europe (B) Reformation");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yGY3L/europe-reformation"));
                    }//chh12
                    
                    else if (chh== 13)
                    {
                        System.out.println("\f");
                        System.out.println("History");
                        System.out.println("13. The Modern Age in Europe (C) Industrial Revolution");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/y7xe3/europe-industrial-revolution"));
                    }//chh13
                    
                    
                    
                }//history
                
                else if (chs==2)
                {
                   System.out.println("\f");
                   System.out.println("Civics");
                   System.out.println("");
                   System.out.println("1. Our Constitution");
                   System.out.println("2. Salient Features of the Constitution-I");
                   System.out.println("3. Salient Features of the Constitution-II");
                   System.out.println("4. Elections");
                   System.out.println("5. Local Self-Government-Rural");
                   System.out.println("6. Local Self-Government-Urban");
                   int chci=sc.nextInt();
                   
                   if (chci== 1)
                    {
                        System.out.println("\f");
                        System.out.println("Civics");
                        System.out.println("1. Our Constitution");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/y7xe3/europe-industrial-revolution"));
                    }//chh1
                    
                    else if (chci==2 )
                    {
                        System.out.println("\f");
                        System.out.println("Civics");
                        System.out.println("2. Salient Features of the Constitution-I");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yNmjK/constitution-features-1"));
                    }//chh2
                    
                    else if (chci==3 )
                    {
                        System.out.println("\f");
                        System.out.println("Civics");
                        System.out.println("3. Salient Features of the Constitution-II");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/y4660/constitution-features-2"));
                    }//chh3
                    
                    else if (chci==4 )
                    {
                        System.out.println("\f");
                        System.out.println("Civics");
                        System.out.println("4. Elections");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yXa53/elections"));
                    }//chh4
                    
                    else if (chci==5 )
                    {
                        System.out.println("\f");
                        System.out.println("Civics");
                        System.out.println("5. Local Self-Government-Rural");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/ymLpg/rural-self-government"));
                    }//chh5
                    
                    else if (chci==6 )
                    {
                        System.out.println("\f");
                        System.out.println("Civics");
                        System.out.println("6. Local Self-Government-Urban");
                        d.browse(new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-history-civics/solutions/yMwwK/urban-self-government"));
                    }//chh6
    
                }//civics
                }
        // geo
        else if (subject==8 )
        {
              System.out.println("\f");
              System.out.println("Geography");
              System.out.println("");
              System.out.println("1. Earth as a Planet");
              System.out.println("2. Geographic Grid: Latitudes and Longitudes");
              System.out.println("3. Rotation and Revolution");
              System.out.println("4. Earth's Structure");
              System.out.println("5. Landforms of the Earth");
              System.out.println("6. Rocks");
              System.out.println("7. Volcanoes");
              System.out.println("8. Earthquakes");
              System.out.println("9. Weathering");
              System.out.println("10.  Denudation");  
              System.out.println("11. Hydrosphere");
              System.out.println("12. Composition and Structure of the Atmosphere");
              System.out.println("13. Insolation");
              System.out.println("14. Atmospheric Pressure and Winds");
              System.out.println("15. Humidity");
              System.out.println("16. Pollution");
              System.out.println("17. Sources of Pollution");
              System.out.println("18. Effects of Pollution");
              System.out.println("19. Preventive Measures");
              System.out.println("20. Natural Regions of the World");
              int chs=sc.nextInt();
              
              if (chs==1)
              {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("1. Earth as a Planet");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kK5gw/earth-planet"));
              }//chg1
               
               else if (chs==2)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("2. Geographic Grid: Latitudes and Longitudes");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kWRpE/latitudes-longitudes"));
               }//chg2
               else if (chs==3)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("3. Rotation and Revolution");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kRAxg/rotation-revolution"));
               }//chg3
               else if (chs==4)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("4. Earth's Structure");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kZy2l/earth-structure"));
               }//chg4
               else if (chs==5)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                   System.out.println("5. Landforms of the Earth");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kdz82/earth-landforms"));
               }//chg5
               else if (chs==6)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("6. Rocks");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kG9b4/rocks"));
               }//chg6
               else if (chs==7)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("7. Volcanoes");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kpx93/volcanoes"));
               }//chg7
               else if (chs==8)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("8. Earthquakes");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kYQVE/earthquakes"));
               }//chg8
               else if (chs==9)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("9. Weathering");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kBnkg/weathering"));
               }//chg9
               else if (chs==10)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("10.  Denudation");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kRAbJ/denudation"));
               }//chg10
               else if (chs==11)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("11. Hydrosphere");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kVWa3/hydrosphere"));
               }//chg11
               else if (chs==12)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("12. Composition and Structure of the Atmosphere");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kyZax/atmosphere-composition-structure"));
               }//chg12
               else if (chs==13)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("13. Insolation");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kRLB3/insolation"));
               }//chg13
               else if (chs==14)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                   System.out.println("14. Atmospheric Pressure and Winds");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kg6mx/atmospheric-pressure-winds"));
               }//chg14
               else if (chs==15)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("15. Humidity");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/bV6mB/humidity"));
               }//chg15
               else if (chs==16)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("16. Pollution");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kEXGE/pollution"));
               }//chg16
               else if (chs==17)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("17. Sources of Pollution");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/k8xYX/pollution-sources"));
               }//chg17
               else if (chs==18)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("18. Effects of Pollution");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/k1m2g/pollution-effects"));
               }//chg18
               else if (chs==19)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("19. Preventive Measures");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kGbOJ/preventive-measures"));
               }//chg19
               else if (chs==20)
               {
                  System.out.println("\f");
                  System.out.println("Geography");
                  System.out.println("");
                  System.out.println("20. Natural Regions of the World");
                  d.browse (new URI("https://www.knowledgeboat.com/learn/class-9-icse-total-geography/solutions/kKAX2/world-natural-regions"));
               }//chg20
               
        }// geography
        
        // english language
        else if (subject==9)
        {
            System.out.println("\f");
            System.out.println("English Language");
            System.out.println("");
            System.out.println("Practice Paper- 1");
            System.out.println("Practice Paper- 2");
            System.out.println("Practice Paper- 3");
            System.out.println("Practice Paper- 4");
            System.out.println("Practice Paper- 5");
            System.out.println("Practice Paper- 6");
            System.out.println("Practice Paper- 7");
            System.out.println("Practice Paper- 8");
            System.out.println("Practice Paper- 9");
            int chs=sc.nextInt();
            
            if (chs==1)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 1");
                  d.browse (new URI("https://queryexpress.com/total-english-class-9-practice-paper-1-solutions/#Fill_in_the_blanks_with_articles_Total_English_class_9_practice_paper_1_solutions"));
                  d.browse (new URI("https://queryexpress.com/notice-writing-on-inter-school-elocution-contest/"));
               }//chel
               else if (chs==2)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 2");
                  d.browse (new URI("https://queryexpress.com/total-english-practice-paper-2-class-9-question-answers/"));
                  d.browse (new URI(""));
               }//chel2
               else if (chs==3)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 3");
                  d.browse (new URI("https://queryexpress.com/total-english-practice-paper-3-icse-class-9-solutions/"));
                  d.browse (new URI("https://queryexpress.com/total-english-practice-paper-3-class-9-question-answers/"));
               }//chel3
               else if (chs==4)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 4");
                  d.browse (new URI("https://queryexpress.com/practice-paper-4-total-english-class-9-solutions/"));
                  d.browse (new URI("https://queryexpress.com/notice-writing-on-arts-and-crafts-exhibition/"));
               }//chel4
               else if (chs==5)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 5");
                  d.browse (new URI("https://queryexpress.com/practice-paper-5-total-english-class-9-solutions/"));
                  d.browse (new URI(""));
               }//chel5
               else if (chs==6)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 6");
                  d.browse (new URI(""));
                  d.browse (new URI(""));
               }//chel6
               else if (chs==7)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 7");
                  d.browse (new URI("https://queryexpress.com/total-english-chapter-7-class-9-question-answers/"));
                  d.browse (new URI(""));
               }//chel7
               else if (chs==8)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 8");
                  d.browse (new URI(""));
                  d.browse (new URI(""));
               }//chel8
               else if (chs==9)
               {
                  System.out.println("\f");
                  System.out.println("English Language");
                  System.out.println("");
                  System.out.println("Practice Paper- 9");
                  d.browse (new URI("https://queryexpress.com/total-english-practice-paper-9-class-9-question-answers/"));
                  d.browse (new URI(""));
               }//chel9
        }//english language
        
        //marathi
        else if (subject==10)
        {
            System.out.println("\f");
            System.out.println("मराठी ");
            System.out.println("");
            System.out.println("1. सर्वात्मकया शिवसुंदरा ");
            System.out.println("2. संतावाणी ");
            System.out.println("3. बेटा, नी ऐकतो आहे!");
            System.out.println("4. जी. आय. पी. रेल्वे");
            System.out.println("5. व्यायामाचे महत्त्व  ");
            System.out.println("6. ऑलिंपिक वर्तृळांचा गोफ");
            System.out.println("7. दिव्याच्या शोधामागचं दिव्य");
            System.out.println("8. सखू  आजी ");
            System.out.println("9. उजाड उघडे माळरानही ");
            System.out.println("10. कुलूप ");
            System.out.println("11. आभाळातल्या पाऊलवाटा");
            System.out.println("12. पुन्हा एकदा ");
            System.out.println("13. तिफन");
            System.out.println("14. ते जीवनदायी झाड");
            System.out.println("15. माझे शिक्षक व संस्कार");
            System.out.println("16. शब्दांचा खेळ ");
            int chs=sc.nextInt();
            
            if (chs==1)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("1. सर्वात्मकया शिवसुंदरा ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-1-%e0%a4%b8%e0%a4%b0%e0%a5%8d%e0%a4%b5%e0%a4%be%e0%a4%a4%e0%a5%8d%e0%a4%ae%e0%a4%95%e0%a4%be-%e0%a4%b6%e0%a4%bf%e0%a4%b5%e0%a4%b8/"));
               }//marathi
               else if (chs==2)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("2. संतावाणी ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-2-1-%e0%a4%b8%e0%a4%82%e0%a4%a4%e0%a4%b5%e0%a4%be%e0%a4%a3%e0%a5%80-%e0%a4%85-%e0%a4%ad%e0%a5%87%e0%a4%9f%e0%a5%80%e0%a4%b2%e0%a4%be/"));
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-2-2-%e0%a4%b8%e0%a4%82%e0%a4%a4%e0%a4%b5%e0%a4%be%e0%a4%a3%e0%a5%80-%e0%a4%86-%e0%a4%b8%e0%a4%82%e0%a4%a4%e0%a4%95%e0%a5%83%e0%a4%aa/"));
               }//marathi2
               else if (chs==3)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("3. बेटा, नी ऐकतो आहे!");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-3-%e0%a4%ac%e0%a5%87%e0%a4%9f%e0%a4%be-%e0%a4%ae%e0%a5%80-%e0%a4%90%e0%a4%95%e0%a4%a4%e0%a5%8b-%e0%a4%86%e0%a4%b9%e0%a5%87/"));
               }//marathi3
               else if (chs==4)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("4. जी. आय. पी. रेल्वे");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-4-%e0%a4%9c%e0%a5%80-%e0%a4%86%e0%a4%af-%e0%a4%aa%e0%a5%80-%e0%a4%b0%e0%a5%87%e0%a4%b2%e0%a5%8d%e0%a4%b5%e0%a5%87/"));
               }//marathi4
               else if (chs==5)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("5. व्यायामाचे महत्त्व  ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-5-%e0%a4%b5%e0%a5%8d%e0%a4%af%e0%a4%be%e0%a4%af%e0%a4%be%e0%a4%ae%e0%a4%be%e0%a4%9a%e0%a5%87-%e0%a4%ae%e0%a4%b9%e0%a4%a4%e0%a5%8d/"));
               }//marathi5
               else if (chs==6)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("6. ऑलिंपिक वर्तृळांचा गोफ ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-6-%e0%a4%91%e0%a4%b2%e0%a4%bf%e0%a4%82%e0%a4%aa%e0%a4%bf%e0%a4%95-%e0%a4%b5%e0%a4%b0%e0%a5%8d%e0%a4%a4%e0%a5%81%e0%a4%b3%e0%a4%be/"));
               }//marathi6
               else if (chs==7)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("7. दिव्याच्या शोधामागचं दिव्य");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-7-%e0%a4%a6%e0%a4%bf%e0%a4%b5%e0%a5%8d%e0%a4%af%e0%a4%be%e0%a4%9a%e0%a5%8d%e0%a4%af%e0%a4%be-%e0%a4%b6%e0%a5%8b%e0%a4%a7%e0%a4%be/"));
               }//marathi7
               else if (chs==8)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("8. सखू  आजी ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-8-%e0%a4%b8%e0%a4%96%e0%a5%82-%e0%a4%86%e0%a4%9c%e0%a5%80/"));
               }//marathi8
               else if (chs==9)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("9. उजाड उघडे माळरानही ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-9-%e0%a4%89%e0%a4%9c%e0%a4%be%e0%a4%a1-%e0%a4%89%e0%a4%98%e0%a4%a1%e0%a5%87-%e0%a4%ae%e0%a4%be%e0%a4%b3%e0%a4%b0%e0%a4%be%e0%a4%a8/"));
               }//marathi9
               else if (chs==10)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("10. कुलूप ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-10-%e0%a4%95%e0%a5%81%e0%a4%b2%e0%a5%82%e0%a4%aa/"));
               }//marathi10
               else if (chs==11)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("11. आभाळातल्या पाऊलवाटा");
                  d.browse (new URI(""));
               }//marathi11
               else if (chs==12)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("12. पुन्हा एकदा ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-11-%e0%a4%86%e0%a4%ad%e0%a4%be%e0%a4%b3%e0%a4%be%e0%a4%a4%e0%a4%b2%e0%a5%8d%e0%a4%af%e0%a4%be-%e0%a4%aa%e0%a4%be%e0%a4%8a%e0%a4%b2/"));
               }//marathi12
               else if (chs==13)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("13. तिफन");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-13-%e0%a4%a4%e0%a4%bf%e0%a4%ab%e0%a4%a8/"));
               }//marathi13
               else if (chs==14)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("14. ते जीवनदायी झाड");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-14-%e0%a4%a4%e0%a5%87-%e0%a4%9c%e0%a5%80%e0%a4%b5%e0%a4%a8%e0%a4%a6%e0%a4%be%e0%a4%af%e0%a5%80-%e0%a4%9d%e0%a4%be%e0%a4%a1/"));
               }//marathi14
               else if (chs==15)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("15. माझे शिक्षक व संस्कार");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-15-%e0%a4%ae%e0%a4%be%e0%a4%9d%e0%a5%87-%e0%a4%b6%e0%a4%bf%e0%a4%95%e0%a5%8d%e0%a4%b7%e0%a4%95-%e0%a4%b5-%e0%a4%b8%e0%a4%82%e0%a4%b8/"));
               }//marathi15
               else if (chs==16)
               {
                  System.out.println("\f");
                  System.out.println("मराठी ");
                  System.out.println("");
                  System.out.println("16. शब्दांचा खेळ ");
                  d.browse (new URI("https://sabdekho.in/maharashtra-board-class-9-marathi-aksharbharati-solutions-chapter-16-%e0%a4%b6%e0%a4%ac%e0%a5%8d%e0%a4%a6%e0%a4%be%e0%a4%82%e0%a4%9a%e0%a4%be-%e0%a4%96%e0%a5%87%e0%a4%b3/"));
               }//marathi16

        }//marathi
   
        
        
  }
}

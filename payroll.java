/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;




import java.io.*;
class Employee
{
    String name,Desig,branch;
    int Empcode,Age;
    Employee(String s,String d,String b,int c,int a)
    {
        name=s;
        Desig=d;
        branch=b;
        Empcode=c;
        Age=a;
    }
    void display()
    {
        System.out.println(Payroll.ANSI_CYAN_BACKGROUND+"Name :"+Payroll.ANSI_CYAN_BACKGROUND+name+"\t\t\t\t\tage :" +Age);
        System.out.println("");
        System.out.println(Payroll.ANSI_CYAN_BACKGROUND+"designation :"+Payroll.ANSI_CYAN_BACKGROUND +Desig+"\t\t\t\temployeecode :" +Empcode);
        System.out.println("");
        System.out.println(Payroll.ANSI_CYAN_BACKGROUND+"branch :" +branch);
        System.out.println("");
        if(null != Desig)
        switch (Desig)
        {
            case "Trainee Engineer":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :10:00AM-4:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :The engineer trainee is responsible for managing the data\n"+Payroll.ANSI_PURPLE_BACKGROUND+"and all the information related to the particular project he/ she is assigned to.");
                System.out.println("");
                break;
            case "Software Engineer":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :9:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job info :A software engineer applies mathematical analysis and \n"+Payroll.ANSI_PURPLE_BACKGROUND+"the principles of computer science in order to design and develop computer software.");
                System.out.println("");
                break;
                
            case "System Analyst":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :9:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :A systems analyst uses analysis and design techniques to \n"+Payroll.ANSI_PURPLE_BACKGROUND+"solve business problems using information technology.");
                System.out.println("");
                break;
            case "Program Analyst":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :9:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info : Programmer analysts perform the jobs of both a systems analyst and a computer programmer.\n"+Payroll.ANSI_PURPLE_BACKGROUND+"Computer Programmers are responsible for implementing designs by writing computer programs.");
                System.out.println("");
                break;
            case "Senior Software Engineer":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :11:00AM-6:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :Senior Software Engineer will develop information systems by studying operations; designing, \n"+Payroll.ANSI_PURPLE_BACKGROUND+"developing and installing software solutions; support and develop software team. \n"+Payroll.ANSI_PURPLE_BACKGROUND+"The Senior Software Engineer will lead a team of developers responsible for building new and support existing websites.");
               System.out.println("");
                break;
            case "Project Lead":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :9:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :The responsibilities of a project leader include the following: They are responsible for setting \n"+Payroll.ANSI_PURPLE_BACKGROUND+"the expectations for their team members. They are responsible to set the direction for their team during project work.");
                System.out.println("");
                break;
            case "Project Manager":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :8:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :The project manager is accountable for the success or failure of a project. \n"+Payroll.ANSI_PURPLE_BACKGROUND+"Typical responsibilities of a project manager include: Planning, Executing, and Closing Projects — \n"+Payroll.ANSI_PURPLE_BACKGROUND+"defining the project, building its comprehensive work plan, and managing to the budget.");
                System.out.println("");
                break;
            case "Technical Specialist":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :8:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :Technical Specialists provide expert consultancy within their area of specialism. \n"+Payroll.ANSI_PURPLE_BACKGROUND+"This may be a business/functional area and/or a particular technology. They develop and/or promote technical solutions which support the business requirements within their area of expertise.");
               System.out.println("");
                break;
            case "Bussiness Analyst":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :8:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job info :The analyst is involved in the design or modification of business systems or IT systems. \n"+Payroll.ANSI_PURPLE_BACKGROUND+"The analyst interacts with the business stakeholders and subject matter experts in order to understand their problems and needs.");          
               System.out.println("");
                break;
            case "Director":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :9:00AM-6:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :Manages the day-to-day business activities and finances and to ensure all statutory filing obligations are met. \n"+Payroll.ANSI_PURPLE_BACKGROUND+"Directors must act lawfully and honestly and make decisions for the benefit of the company and its members.");
                System.out.println("");
                break;
            case "Vice President":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :8:00AM-6:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :Sign documents and make commitments for the company for which the company is legally liable. \n"+Payroll.ANSI_PURPLE_BACKGROUND+"Participate on the president- or CEO-led team that creates the organization's overall vision, mission, values, beliefs, and strategic goals.");
                System.out.println("");
                break;
            case "President":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :8:00AM-6:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :President sets policies and strategic direction for the company, both for the near term and for the foreseeable future. \n"+Payroll.ANSI_PURPLE_BACKGROUND+"It's her responsibility to ensure the company follows its mission, policies and procedures that are in place, and is profitable.");
                System.out.println("");
                break;
            case "Chief Executive Officer(CEO)":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :8:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :A chief executive officer (CEO) is the highest-ranking executive in a company, \n"+Payroll.ANSI_PURPLE_BACKGROUND+"swhose primary responsibilities include making major corporate decisions, \n"+Payroll.ANSI_PURPLE_BACKGROUND+"managing the overall operations and resources of a company, acting as the main point of communication between the board of directors (the board) and corporate");
                System.out.println("");
                break;
            case "Human Resources Manager(HR)":
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Timming Slot :8:00AM-5:00PM");
                System.out.println("");
                System.out.println(Payroll.ANSI_PURPLE_BACKGROUND+"Job Info :Oversee the recruiting, interviewing, and hiring of new staff; consult with top executives on strategic planning; \n"+Payroll.ANSI_PURPLE_BACKGROUND+"and serve as a link between an organization's management and its employees.");
                System.out.println("");
                break;
            default:
                break;
        }          
    }
}
class Salary extends Employee
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int leaves,sal,m,pro;
    double bs,hra,cn,mr,te,pf,pft,td;
    Salary(String s,String d,String b,int c,int a,int salry)
    {
        
        super(s,d,b,c,a);
        sal=salry;
              
    }
    
        void display(int i) throws IOException
        {
            
             if(i==1)
             super.display();
             else
             {
                 System.out.println("Select the month\n1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December");
                 m=Integer.parseInt(br.readLine());
                 System.out.println("Enter leaves");
                 leaves=Integer.parseInt(br.readLine());
                 if(leaves>=5)
                     leaves=leaves-5;
                 else
                     leaves=0;
                 System.out.println("Enter promotion");
                 pro=Integer.parseInt(br.readLine());
                 switch (m) {
                      case 1:
                      case 3:
                      case 5:
                      case 7:
                      case 8:
                      case 10:
                      case 12:
                            bs=(sal/31)*(31-leaves);
                            break;
                      case 2:
                            bs=(sal/28)*(28-leaves);
                            break;
                      default:
                            bs=(sal/30)*(30-leaves);
                            break;
                    }
                hra=0.5*bs;
                cn=1600;
                mr=1250;
                te=bs+hra+cn+mr+pro;
                pf=0.12*te;
                if(te>10000)
                    pft=200;
                else
                    pft=175;
                td=pf+pft;
                super.display();
               
                System.out.println("no. of leaves :" +leaves);
                System.out.println(Payroll.ANSI_GREEN_BACKGROUND+"\tEARNINGS\t\t\t\t"+Payroll.ANSI_RED_BACKGROUND+"\t\t\t\t\tDEDUCTIONS______");
                System.out.println("Basic Salary \t\t\t"+bs+"\t\t\t\t        Provident fund\t\t"+pf+"\t");
               
                System.out.println("House Rent ALlownce \t\t"+hra+"\t\t\t\t\tProfessional Tax\t"+pft+"\t");
                System.out.println("Conveyance Allowance \t\t"+cn+"\t\t");
                System.out.println("Medical reimbursement\t\t"+mr+"\t");
                System.out.println("Added Promotion\t\t\t"+pro+"\t");
                System.out.println("");
                System.out.println(Payroll.ANSI_GREEN_BACKGROUND+"TOTAL EARNINGS\t\t\t"+te+"\t\t"+Payroll.ANSI_RED_BACKGROUND+"  \t   \t\tTOTAL DEDUCTIONS\t"+td);
               
               
               
                System.out.println("");
                System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"======NET PAY=====:"+(te-td));
             }
        }
}
public class Payroll 
{
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    
     public static void main(String[] args)throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println(ANSI_PURPLE_BACKGROUND+" \t\t       SENSYS TECHNOLOGIES           ");
         System.out.println("   \t\t Churchgate Mumbai-400020 Maharashtra                 ");
         System.out.println("       \t\t    \t  PVT LTD..          ");
       int pass,ch,n,x,i,id,age,ch1,ch2;
       String name,des;
       Salary s[]=new Salary[20];
       s[0]=new Salary("Emma Wiliams","Trainee Engineer","Churchgate",100,25,15000);
       s[1]=new Salary("Liam Taylor","Trainee Engineer","Churchgate",101,24,15000);
       s[2]=new Salary("Oliver Smith","Trainee Engineer","Churchgate",103,24,150000);
       s[3]=new Salary("Michael Johnson","Software Engineer","Churchgate",104,27,25000);  
       s[4]=new Salary("Aaron Finch","Software Engineer","Churchgate",105,26,25000);
       s[5]=new Salary("Robert Stark","System Analyst","Churchgate",106,27,22000);
       s[6]=new Salary("Steve Rogers","Program Analyst","Churchgate",107,28,22000);
       s[7]=new Salary("Glenn Maxwell","Senior Software Engineer","Churchgate",108,26,40000);
       s[8]=new Salary("Elizabeth Green","Project Lead","Churchgate",109,28,35000);
       s[9]=new Salary("Carter Williams","Project Lead","Churchgate",110,27,35000);
       s[10]=new Salary("Scarlet Johnson","Project Manager","Churchgate",111,29,40000);
       s[11]=new Salary("Barton Moore","Technical Specialist","Churchgate",112,27,45000);
       s[12]=new Salary("Dylan Parker","Bussiness Analyst","Churchgate",113,30,42000);
       s[13]=new Salary("Nick Furry","Director","Churchgate",114,32,60000);
       s[14]=new Salary("Tywin Lee","Vice President","Churchgate",115,33,70000);
       s[15]=new Salary("Rob Anderson","President","Churchgate",116,35,85000);
       s[16]=new Salary("Jon Snow","Chief Executive Officer(CEO)","Churchgate",117,36,100000);
       s[17]=new Salary("Arya Stark","Human Resources Manager(HR)","Churchgate",117,36,55000);
       do
       {
          System.out.println("1.Empl details\n2.Salary slip\n3.Recruit New employees\n4.Exit\nenter opt");
           ch=Integer.parseInt(br.readLine());
           if(ch==1||ch==2)
           {
            System.out.println("1.Emma Wiliams\n2.Liam Taylor\n3.Oliver Smith\n4.Michael Johnson\n5.Aaron Finch\n6.Robert Stark \n7.Steve Rogers \n8.Glenn Maxwell \n9.Elizabeth Green \n10.Carter Williams \n11.Scarlet Johnson \n12.Barton Moore \n13.Dylan Parker \n14.Nick Furry \n15.Tywin Lee \n16.Rob Anderson \n17.Jon Snow\n18.Arya Stark\nEnter opt");
            n=Integer.parseInt(br.readLine());
            switch (n)
            {
              case 1:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2001)
                  s[0].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
              case 2:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2002)
                  s[1].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
              case 3:
                   System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2003)
                  s[2].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
              case 4:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2004)
                  s[3].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
              case 5:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2005)
                  s[4].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
              case 6:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2006)
                  s[5].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 7:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2007)
                  s[6].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 8:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2008)
                  s[7].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 9:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2009)
                  s[8].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 10:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2010)
                  s[9].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 11:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2011)
                  s[10].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 12:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2012)
                  s[11].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 13:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2013)
                  s[12].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 14:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2014)
                  s[13].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 15:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2015)
                  s[14].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 16:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2016)
                  s[15].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 17:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2017)
                  s[16].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  case 18:
                  System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                  pass=Integer.parseInt(br.readLine());
                  if(pass==2018)
                  s[17].display(ch);
                  else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  break;
                  default :
                  break;
            }
        }
           else if(ch==3)
           {
                System.out.println(Payroll.ANSI_YELLOW_BACKGROUND +"WELCOME TO NEW EMPLOYEE LIST:");
                System.out.println(Payroll.ANSI_RED_BACKGROUND +"ENTER THE NO OF NEW EMPLOYEES TO BE ADDED:");
                int no=Integer.parseInt(br.readLine());
                if(no==1||no==2)
                {
                System.out.println(Payroll.ANSI_RED_BACKGROUND +"Enter Empl details");
                for(int j =18; j<no+18; j++)
                {
                   System.out.println(Payroll.ANSI_YELLOW_BACKGROUND +"Enter name:");
                   name=br.readLine();

                   System.out.println(Payroll.ANSI_YELLOW_BACKGROUND +"Enter Designation");
                   des=br.readLine();

                   System.out.println(Payroll.ANSI_YELLOW_BACKGROUND +"Enter emp Id");
                   id=Integer.parseInt(br.readLine());

                   System.out.println(Payroll.ANSI_YELLOW_BACKGROUND +"Enter age");
                   age=Integer.parseInt(br.readLine());

                   System.out.println(Payroll.ANSI_YELLOW_BACKGROUND +"Enter Salary");
                   int salary=Integer.parseInt(br.readLine());

                   s[j]=new Salary(name,des,"Churchgate",id,age,salary);
                }
                }
                else
                    System.out.println("Capacity Full");

                   
                   while(no==1||no==2)
                   {
                   System.out.println(Payroll.ANSI_YELLOW_BACKGROUND +"1.Empl details\n"+Payroll.ANSI_YELLOW_BACKGROUND +"2.Salary slip\n enter opt");
                   ch1=Integer.parseInt(br.readLine());    
                   int count=1;
                   for(i=18;i<no+18;i++)
                   {
                       System.out.println(count+"."+s[i].name);
                       count++;
                   }
                   System.out.println("ENTER CHOICE");
                   ch2=Integer.parseInt(br.readLine());
                   System.out.println(Payroll.ANSI_YELLOW_BACKGROUND+"ENTER PASSWORD");
                   pass=Integer.parseInt(br.readLine());
                   if(pass==3001)
                    s[ch2+17].display(ch1);
                   else
                      System.out.println(Payroll.ANSI_RED_BACKGROUND+"INCORRECT PASSWORD");
                  
                    System.out.println("WANT TO CONTIUE WITH RECRIUTED EMPLOYEE OR GO TO CURRENT EMPLOYEES......?\n1.Yes\n2.No");
                    int y=Integer.parseInt(br.readLine());
                    if(y==2)
                        break;
                   }
                        
                
           }
       }while(ch!=4);
    }
}

package Day_twelve;

import java.util.Random;

public class MakeAGameWithWords {
    public static void main(String[] args){
        Role r1 = new Role("佩奇",100,'女');
        Role r2 = new Role("乔治",100,'男');
        r1.showRoleInfo();
        r2.showRoleInfo();
        while(true){
            r1.attack(r2);
            System.out.println();
            if(r2.getBlood() == 0){
                System.out.println(r1.getRole() + "K.O" + r2.getRole());
                break;
            }
            r2.attack(r1);
            System.out.println();
            if(r2.getBlood() == 0){
                System.out.println(r1.getRole() + "K.O" + r2.getRole());
                break;
            }
        }
    }
}

class Role{
    private String role;
    private double blood;
    private char gender;
    private String face;

    //角色长相
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    //攻击描述和受伤描述
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role(){

    }

    public Role(String role,double blood,char gender){
        this.role = role;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getBlood() {
        return blood;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random  r = new Random();
        if(this.gender == '男'){
            int index1 = r.nextInt(boyfaces.length);
            this.face = boyfaces[index1];
            //从boyfaces中随机长相
        }else if(this.gender == '女'){
            //从girlfaces中随机长相
            int index2 = r.nextInt(girlfaces.length);
            this.face = girlfaces[index2];
        }else{
            //既不是男也不是女给一个默认的长相
            this.face = "男男女女";
        }
    }

    //定义一个方法攻击别人
    //定义为方法的调用者(对象)攻击参数(对象)
    public void attack(Role role){
        Random r1 = new Random();
        //输出一个攻击的效果
        int index1 = r1.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index1];
        System.out.printf(KungFu,this.getRole(),role.getRole());

        //计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        double remainblood = role.getBlood() - hurt;
        remainblood = remainblood > 0 ? remainblood : 0;//判断是否为负数，负数直接化为0
        role.setBlood(remainblood);

        //输出一个受伤的描述
        //根据人物受伤程度不同来输出不同描述
        if(remainblood > 90){
            System.out.printf(injureds_desc[0],role.getRole());
        }else if(remainblood > 80 && remainblood <= 90){
            System.out.printf(injureds_desc[1],role.getRole());
        }else if(remainblood > 70 && remainblood <= 80){
            System.out.printf(injureds_desc[2],role.getRole());
        }else if(remainblood > 60 && remainblood <= 70){
            System.out.printf(injureds_desc[3],role.getRole());
        }else if(remainblood > 40 && remainblood <= 60){
            System.out.printf(injureds_desc[4],role.getRole());
        }else if(remainblood > 20 && remainblood <= 40){
            System.out.printf(injureds_desc[5],role.getRole());
        }else if(remainblood > 10 && remainblood <= 20){
            System.out.printf(injureds_desc[6],role.getRole());
        }else if(remainblood <= 10){
            System.out.printf(injureds_desc[7],role.getRole());
        }
    }

    //展示角色信息的方法
    public void showRoleInfo(){
        System.out.println("姓名为：" + this.getRole());
        System.out.println("血量为：" + this.getBlood());
        System.out.println("性别为：" + this.getGender());
        System.out.println("长相为：" + this.getFace());
    }
}

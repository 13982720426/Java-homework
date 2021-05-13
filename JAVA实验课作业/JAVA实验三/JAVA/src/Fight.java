
 class Tank {
    //【代码 1】//声明 double 型变量 speed,刻画速度
    double speed;
    //【代码 2】//声明 int 型变量 bulletAmount,刻画炮弹数量
    int bulletAmount;
    void speedUp(int s) {
        //【代码 3】 //将 s+speed 赋值给 speed
        speed=s+speed;
    }
    void speedDown(int d) {
        if(speed-d>=0)
            //【代码 4】 //将 speed-d 赋值给 speed
            speed=speed-d;
        else
            speed = 0;
    }
    void setBulletAmount(int m) {
        bulletAmount = m;
    }
    int getBulletAmount() {
        return bulletAmount;
    }
    double getSpeed() {
        return speed;
    }
    void fire() {
        if(bulletAmount>=1){
            //【代码 5】 //将 bulletAmount-1 赋值给 bulletAmount
            bulletAmount=bulletAmount-1;
            System.out.println("打出一发炮弹");
        }
        else {
            System.out.println("没有炮弹了,无法开火");
        }
    }
}

public class Fight {
    public static void main(String args[]) {
        Tank tank1,tank2;
        tank1 = new Tank();
        tank2 = new Tank();
        tank1.setBulletAmount(10);
        tank2.setBulletAmount(10);
        System.out.println("tank1 的炮弹数量："+tank1.getBulletAmount());
        System.out.println("tank2 的炮弹数量："+tank2.getBulletAmount());
        tank1.speedUp(80);
        tank2.speedUp(90);
        System.out.println("tank1 目前的速度："+tank1.getSpeed());
        System.out.println("tank2 目前的速度："+tank2.getSpeed());
        tank1.speedDown(15);
        tank2.speedDown(30);
        System.out.println("tank1 目前的速度："+tank1.getSpeed());
        System.out.println("tank2 目前的速度："+tank2.getSpeed());
        System.out.println("tank1 开火：");
        tank1.fire();
        System.out.println("tank2 开火：");
        tank2.fire();
        tank2.fire();
        System.out.println("tank1 的炮弹数量："+tank1.getBulletAmount());
        System.out.println("tank2 的炮弹数量："+tank2.getBulletAmount());
    }
}
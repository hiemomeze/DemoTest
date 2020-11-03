/**
 * 子类如果和父类声明了相同名称的属性，则在子类中直接访问的时候肯定采用“就近访问原则”，
 * s即先找到本类中的属性，如果此时要调用父类中的属性，直接使用”super.属性“格式即可
 */
class Student extends Person22 {
    public String info="LXH";     //此属性与父类中的属性名称一致  ，不一致好像也没有关系（to)

    public Student(String name) {
        super(name);
    }

    public void print(){
        System.out.println("父类的属性");     //访问父类中的info属性
        System.out.println("子类的属性"+this.info);        //访问本类中的info属性
    }
}

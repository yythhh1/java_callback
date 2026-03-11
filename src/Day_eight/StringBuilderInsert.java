package Day_eight;

public class StringBuilderInsert {
    public static void main(String[] args){
        String[] fields = {"name","position","salary"};
        String table = "employee";
        String insert = builderInsertSql(table,fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    static String builderInsertSql(String table,String fields[]){
        StringBuilder b1 = new StringBuilder();
        b1.append("INSERT INTO ").append(table).append(" (");
        for(int i = 0;i < fields.length;i++){
            if(i != fields.length-1){
                b1.append(fields[i]).append(", ");
            }else{
                b1.append(fields[i]);
            }
        }
        b1.append(") VALUES (?, ?, ?)");
        return b1.toString();
    }
}

package Day_eight;

import java.util.StringJoiner;

public class StringJoinerSelect {
    public static void main(String[] args){
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql1(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    static String buildSelectSql1(String table,String[] fields){
        String end = " FROM " + table;
        StringJoiner joiner = new StringJoiner(", ","SELECT ",end);
        for(int i = 0;i < fields.length;i++){
            joiner.add(fields[i]);
        }
        String result = joiner.toString();
        return result;
    }
}

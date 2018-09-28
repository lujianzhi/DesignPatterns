import java.text.*;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by Ian.Lu on 2016/11/15.
 * Project : DesignPatterns
 */
public class TestClass {

    public static void main(String args[]) {

//        double a = 2345.23;
//        String a = "as";
//        String aStr = String.valueOf(a);
//        System.out.print(aStr);

//        List<Boolean> list = new ArrayList<>();
//        list.add(false);
//        list.add(true);
//        list.add(false);
//        list.add(true);
//
//        list.sort(new Comparator<Boolean>() {
//            @Override
//            public int compare(Boolean o1, Boolean o2) {
//                if(o1){
//                    return -1;
//                }else{
//                    return 1;
//                }
//            }
//        });
//
//        System.out.print(list.toString());

//        String content = "      ";
//        System.out.print(String.valueOf(content.trim().length()));

//        String content = "Ian";
//        System.out.print("\""+content+"\"");


//        String regexstr = "<(?!img|br).*?>";
//        Pattern pattern = Pattern.compile(regexstr);
//        Matcher matcher = pattern.matcher("<div style=\\\"\\\" class=\\\"q-question f-bfc\\\">【撒地方第13题】<a target=\\\"_blank\\\" class=\\\"s-c-turquoise\\\" href=\\\"http://homework.leke.cn/auth/student/homework/viewWork.htm?homeworkDtlId=3318496701\\\">《带一波答题卡》</a></div>");
////        Matcher matcher = pattern.matcher("<div>【题文】下面哪一种鸟儿是我国珍稀动物？(&nbsp; )</div>");
//        String result = matcher.replaceAll("");
//        System.out.print(result);

//        Long paperIdL = 1L;
//
//        long paperId = paperIdL == null ? 0L : paperIdL;
//
//        System.out.print("paperId : " + paperId);

//        System.out.print("paperId _: ".replaceAll("_","•"));
//
//        ArrayList<Entity> list = new ArrayList<>();
//        list.add(new Entity("1"));
//        list.add(new Entity("2"));
//        list.add(new Entity("3"));
//        list.add(new Entity("4"));
//
//        for (Entity entity : list) {
//            if ("2".equals(entity.getName())) {
//                entity.setName("lll");
//            }
//        }
//
//        System.out.println(list.toString());

//        Thread thread = new DaemonThread();
////        thread.setDaemon(true);
//        thread.start();

//        System.out.println(1/3);
//        System.out.println(-14/3);
//        System.out.println(100%1.0);
//        System.out.println(1.0/0.0);

//        DaemonThread daemonThread = new DaemonThread();
//        daemonThread.start();

//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//        list2.add(4);
//        list2.add(5);
//
//
//
//        for(Integer intValue : list1){
//            System.out.println("还是会执行");
//            for(Integer intValue2 : list2){
//                if(intValue == intValue2){
//                    System.out.println("int : "+intValue);
//                    break;
//                }
//            }
//        }

//        String str = "<img src=\\\"https://file.leke.cn/group1/M00/10/DA/wKgURFkCqRyAKLSBAABoD17WKB0417.jpg\\\" width=\\\"200\\\" height=\\\"200\\\"/><br/><img src=\\\"https://file.leke.cn/group1/M00/10/DA/wKgURFkCqRmADghZAAFQI0u8Jho906.jpg\\\"/><br/><img src=\\\"https://file.leke.cn/group1/M00/10/DA/wKgURFkCqRmAJsLWAAGyIwsuZgw955.jpg\\\"/><br/><img src=\\\"https://file.leke.cn/group1/M00/10/DA/wKgURFkCqRqAByfTAAEOyl85zJs186.jpg\\\"/>";
//        StringBuilder sb = new StringBuilder();
//        String[] imgs = str.split("<br/>");
//        for (String img : imgs) {
//            if (!(img.contains("width") || img.contains("height"))) {
//                img = img.replaceAll("/>", ">");
//                img = img.replaceAll(">", " width=\"200\" height=\"200\"/>");
//            }
//            sb.append(img + "<br/>");
//        }
//        System.out.println(sb.toString());

//        Boolean a = null;
//        if(a){
//            System.out.println("null");
//        }

//        test(null);

//        String str = "<img src=\"https://file.leke.cn/group1/M00/10/E9/wKgURFkL1YeALnPqAACYw1R44kM595.jpg\" />";
//        String[] strs = str.split("\"");
//        System.out.println(strs[1]);

//        formatDouble(1.2345);

//        System.out.println(formatPaperName("一二三四五六七八九十一二三四五六七八九十1"));

//        formatLong("123_0");

//        testAddAll();

//        formatUrl();

//        formatData(1508828304447L);
//        formatData(System.currentTimeMillis());

//        mapTest();

//        testIterator();

//        testMap();

//        testQueue();

//        System.out.println(getTimestampString(new Date(System.currentTimeMillis() - 56400000)));

//        formatDate();

//        System.out.print(formatStr("asd\\\\"));

//        sort();

//        formatDate(System.currentTimeMillis());
        formatDate(0);
    }


    private static void formatDate(long time) {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        long timeFormat = Long.parseLong(formatter.format(new Date(time)));
        System.out.println(timeFormat);
    }


    private static void sort() {
        List<Entity> entityList = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("######0.00");
        for (int i = 0; i < 50; i++) {
            entityList.add(new Entity(String.valueOf(i), Double.parseDouble(df.format(Math.random() * 100))));
        }

        Collections.sort(entityList, new Comparator<Entity>() {
            @Override
            public int compare(Entity o1, Entity o2) {
                return (int) (o2.getScore() * 100 - o1.getScore() * 100);
            }
        });

        for (Entity entity : entityList) {
            System.out.println("name : " + entity.getName() + "; score : " + entity.getScore());
        }
    }

    private static String formatStr(String str) {
        return str.replaceAll("\"", "\\\\\"");
    }

    private static void formatDate() {
        String str = "2017-07-22 21:47:00";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = format.parse(str);
            System.out.println(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = new Date(1500731220000L);
        System.out.println(format1.format(date2));

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            SimpleDateFormat format2 = new SimpleDateFormat("mm:ss");
            Date date3 = new Date(188000);
            System.out.println(format2.format(date3));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 传入时间距离现在的时间，昨天前天
     */
    public static String getTimestampString(Date paramDate) {
        String str = null;
        long l = paramDate.getTime();
        Calendar localCalendar = GregorianCalendar.getInstance();
        localCalendar.setTime(paramDate);
        int year = localCalendar.get(Calendar.YEAR);
        if (!isSameYear(year)) { //去年，直接返回
            String paramDate2str = new SimpleDateFormat("yyyy MM dd", Locale.CHINA).format(paramDate);
            return paramDate2str;
        }

        if (isSameDay(l)) {
            str = "HH:mm";
        } else if (isYesterday(l)) {
            str = "昨天 HH:mm";
        } else if (isBeforeYesterday(l)) {
            str = "前天 HH:mm";
        } else {
            str = "MM-dd";
        }
        String paramDate2str = new SimpleDateFormat(str, Locale.CHINA).format(paramDate);
        return paramDate2str;
    }


    /**
     * 获取 今天开始结束 时间
     */
    private static TimeInfo getTodayStartAndEndTime() {
        Calendar localCalendar1 = Calendar.getInstance();
        localCalendar1.set(Calendar.HOUR_OF_DAY, 0);
        localCalendar1.set(Calendar.MINUTE, 0);
        localCalendar1.set(Calendar.SECOND, 0);
        localCalendar1.set(Calendar.MILLISECOND, 0);
        Date localDate1 = localCalendar1.getTime();
        long l1 = localDate1.getTime();
        Calendar localCalendar2 = Calendar.getInstance();
        localCalendar2.set(Calendar.HOUR_OF_DAY, 23);
        localCalendar2.set(Calendar.MINUTE, 59);
        localCalendar2.set(Calendar.SECOND, 59);
        localCalendar2.set(Calendar.MILLISECOND, 999);
        Date localDate2 = localCalendar2.getTime();
        long l2 = localDate2.getTime();
        TimeInfo localTimeInfo = new TimeInfo();
        localTimeInfo.setStartTime(l1);
        localTimeInfo.setEndTime(l2);
        return localTimeInfo;

    }

    /**
     * 获取 昨天开始结束 时间
     */
    private static TimeInfo getYesterdayStartAndEndTime() {
        Calendar localCalendar1 = Calendar.getInstance();
        localCalendar1.add(Calendar.DAY_OF_MONTH, -1);//5
        localCalendar1.set(Calendar.HOUR_OF_DAY, 0);//11
        localCalendar1.set(Calendar.MINUTE, 0);//12
        localCalendar1.set(Calendar.SECOND, 0);//13
        localCalendar1.set(Calendar.MILLISECOND, 0);//Calendar.MILLISECOND
        Date localDate1 = localCalendar1.getTime();
        long l1 = localDate1.getTime();
        Calendar localCalendar2 = Calendar.getInstance();
        localCalendar2.add(Calendar.DAY_OF_MONTH, -1);//5
        localCalendar2.set(Calendar.HOUR_OF_DAY, 23);//11
        localCalendar2.set(Calendar.MINUTE, 59);//12
        localCalendar2.set(Calendar.SECOND, 59);//13
        localCalendar2.set(Calendar.MILLISECOND, 999);//Calendar.MILLISECOND
        Date localDate2 = localCalendar2.getTime();
        long l2 = localDate2.getTime();
        TimeInfo localTimeInfo = new TimeInfo();
        localTimeInfo.setStartTime(l1);
        localTimeInfo.setEndTime(l2);
        return localTimeInfo;
    }


    /**
     * 获取 前天开始结束 时间
     */
    private static TimeInfo getBeforeYesterdayStartAndEndTime() {
        Calendar localCalendar1 = Calendar.getInstance();
        localCalendar1.add(Calendar.DAY_OF_MONTH, -2);
        localCalendar1.set(Calendar.HOUR_OF_DAY, 0);
        localCalendar1.set(Calendar.MINUTE, 0);
        localCalendar1.set(Calendar.SECOND, 0);
        localCalendar1.set(Calendar.MILLISECOND, 0);
        Date localDate1 = localCalendar1.getTime();
        long l1 = localDate1.getTime();
        Calendar localCalendar2 = Calendar.getInstance();
        localCalendar2.add(Calendar.DAY_OF_MONTH, -2);
        localCalendar2.set(Calendar.HOUR_OF_DAY, 23);
        localCalendar2.set(Calendar.MINUTE, 59);
        localCalendar2.set(Calendar.SECOND, 59);
        localCalendar2.set(Calendar.MILLISECOND, 999);
        Date localDate2 = localCalendar2.getTime();
        long l2 = localDate2.getTime();
        TimeInfo localTimeInfo = new TimeInfo();
        localTimeInfo.setStartTime(l1);
        localTimeInfo.setEndTime(l2);
        return localTimeInfo;
    }

    private static boolean isSameDay(long paramLong) {
        TimeInfo localTimeInfo = getTodayStartAndEndTime();
        return (paramLong > localTimeInfo.getStartTime()) && (paramLong < localTimeInfo.getEndTime());
    }

    private static boolean isYesterday(long paramLong) {
        TimeInfo localTimeInfo = getYesterdayStartAndEndTime();
        return (paramLong > localTimeInfo.getStartTime()) && (paramLong < localTimeInfo.getEndTime());
    }

    private static boolean isBeforeYesterday(long paramLong) {
        TimeInfo localTimeInfo = getBeforeYesterdayStartAndEndTime();
        return (paramLong > localTimeInfo.getStartTime()) && (paramLong < localTimeInfo.getEndTime());
    }

    private static boolean isSameYear(int year) {
        Calendar cal = Calendar.getInstance();
        int CurYear = cal.get(Calendar.YEAR);
        return CurYear == year;
    }

    private static class TimeInfo {
        private long startTime;
        private long endTime;

        public long getStartTime() {
            return this.startTime;
        }

        public void setStartTime(long paramLong) {
            this.startTime = paramLong;
        }

        public long getEndTime() {
            return this.endTime;
        }

        public void setEndTime(long paramLong) {
            this.endTime = paramLong;
        }
    }

    private static void testQueue() {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>();
        try {
            queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testMap() {
        Entity entity1 = new Entity("sub-1");
        Entity entity2 = new Entity("sub-2");
        Entity entity3 = new Entity("sub-3");
        Entity entity4 = new Entity("sub-4");
        Entity entity5 = new Entity("sub-5");
        Entity entity6 = new Entity("sub-6");
        List<Entity> list1 = new ArrayList<>();
        List<Entity> list3 = new ArrayList<>();
        List<Entity> list5 = new ArrayList<>();
        list1.add(entity1);
        list1.add(entity2);
        list1.add(entity3);
        list3.addAll(list1);
        list5.addAll(list1);
        List<Entity> list2 = new ArrayList<>();
        List<Entity> list4 = new ArrayList<>();
        List<Entity> list6 = new ArrayList<>();
        list2.add(entity4);
        list2.add(entity5);
        list2.add(entity6);
        list4.addAll(list2);
        list6.addAll(list2);
        Map<Integer, Entity> map1 = new HashMap<>();
        map1.put(1, new Entity("1", list1));
        map1.put(3, new Entity("3", list3));
        map1.put(5, new Entity("5", list5));
        Map<Integer, Entity> map2 = new HashMap<>();
        map2.put(2, new Entity("2", list2));
        map2.put(3, new Entity("3", list4));
        map2.put(6, new Entity("6", list6));

        Iterator<Integer> iterator = map2.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (map1.containsKey(key)) {
                map1.get(key).getSubs().addAll(map2.get(key).getSubs());
//                Entity aim = map1.get(key);
//                List<Entity> list9 = aim.getSubs();
//                if (list9.addAll(map2.get(key).getSubs())) {
//                    map1.put(key, aim);
//                }
            }
        }

        System.out.println(map1.toString());
    }

    private static void testIterator() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");

        Iterator<Integer> mapIdsIterator = map.keySet().iterator();
        System.out.println("输出" + mapIdsIterator.next());
        System.out.println("输出" + mapIdsIterator.next());
        System.out.println("输出" + mapIdsIterator.next());

        map.remove(2);

    }

    private static void mapTest() {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.remove(1);

        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
//        map.put(2, "after 2");
        map.replace(2, "replace 2");

//        System.out.println(map.get(2));

        Iterator<Integer> keySet = map.keySet().iterator();
        while (keySet.hasNext()) {
            int key = keySet.next();
            System.out.println("has key : " + key);
            for (int i = 0; i < 2; i++) {
                System.out.println("for");
                System.out.println("has i : " + i);
                if (key == i) {
                    keySet.remove();
                    System.out.println("移除" + key);
                }

            }
        }

        System.out.println(map.values());

    }

    private static void formatData(long time) {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTimeInMillis(time);
        System.out.println(time + " = " + formatter.format(calendar.getTime()));
    }

    private static void formatUrl() {
        String str = "<img src=\"http://file.leke.cn/group1/M00/1D/52/wKjIKFdsf_mAPcy0AAOYbDouSr880.jpeg\" style=\"width:1273px;height:913px;\"/>";
        System.out.println(fortmat_1(str));
//        String[] strs = str.split("\"");
//        System.out.println(strs[1]);

        String str2 = "http://file.leke.cn/group1/M00/1D/52/wKjIKFdsf_mAPcy0AAOYbDouSr880.jpeg";
        String[] strs2 = str2.split("/");
        System.out.println(strs2[strs2.length - 1]);

        String str3 = "<p>\n" +
                "\t<span>下面每个图形是否关于某条直线成轴对称？若是，请画出这条直线．</span><span></span> \n" +
                "</p>\n" +
                "<p style=\"text-align:center;\">\n" +
                "\t<img src=\"https://file.leke.cn/group2/M00/F8/22/wKjIG1mAoMGABUJiAAKsjl-kD9U859.png\" style=\"width:1094px;height:284px;\" /> \n" +
                "</p>";
        String[] strs3_1 = str3.split("<img");
        String str3_2 = strs3_1[1];
        System.out.println(fortmat_1(str3_2));
//        String[] strs3_2 = str3_2.split("\"");
//        System.out.println(strs3_2[1]);
    }

    private static String fortmat_1(String str) {
        if (str.contains("src=")) {
            String[] strs = str.split("\"");
            str = strs[1].trim();
        }
        return str;
    }

    private static void testAddAll() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.set(2, 5);

        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        list3.addAll(list4);


        System.out.println(list.toString());
        System.out.println(list2.toString());
    }

    private static void formatLong(String str) {
        System.out.println(Long.parseLong(str.split("_")[0]));
    }

    private static String formatPaperName(String homeworkName) {
        if (homeworkName.length() <= 20) {
            return homeworkName;
        } else {
            return homeworkName.substring(0, 20) + "...";
        }
    }

    private static void formatDouble(double initScore) {
        NumberFormat format = new DecimalFormat("0.0");
        System.out.println(Double.parseDouble(format.format(initScore)));
    }

    private static void test(Obj str) {
        if (str instanceof ObjB) {
            System.out.println("sdf");
        }
    }

    private static abstract class Obj {
        String a = "aaa";
    }

    private static class ObjB extends Obj {
        String a = "bbb";
    }

    private static class ObjC extends Obj {
        String a = "ccc";
    }

    private static class DaemonThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                return;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("finally");
            }
        }
    }

}

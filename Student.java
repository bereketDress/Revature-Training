package recurssion;

import java.util.*;
class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pq = new PriorityQueue<>(
                Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getID)
        );

        for (String event : events) {
            String[] parts = event.split(" ");

            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                pq.offer(new Student(id, name, cgpa));
            }
            else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        List<Student> remaining = new ArrayList<>();
        while (!pq.isEmpty()) {
            remaining.add(pq.poll());
        }

        return remaining;
    }
}


class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEvents = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();

        for (int i = 0; i < totalEvents; i++) {
            events.add(scanner.nextLine());
        }

        Priorities priorities = new Priorities();
        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student s : students) {
                System.out.println(s.getName());
            }
        }
    }
}

class Solution1 {

    static Iterator func(ArrayList mylist) {

        Iterator it = mylist.iterator();

        while (it.hasNext()) {
            Object element = it.next();

            if (element instanceof String)
                break;
        }

        return it;
    }

    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");

        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator it = func(mylist);

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}

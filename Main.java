import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main {

    private JTextArea announcementsArea;

    public void login() {
        JFrame jf = new JFrame("NITTE HOSTEL LEAVE MANAGER ");
        JLabel LoginID, password;
        LoginID = new JLabel("LOGIN ID");
        password = new JLabel("PASSWORD");
        LoginID.setBounds(20, 10, 100, 30);
        jf.add(LoginID);

        password.setBounds(20, 50, 100, 30);
        jf.add(password);

        JTextField id_text = new JTextField();
        id_text.setBounds(100, 10, 200, 30);
        JPasswordField pwrd = new JPasswordField();
        pwrd.setBounds(100, 50, 200, 30);
        jf.add(id_text);
        jf.add(pwrd);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(150, 110, 100, 30);
        jf.add(submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loginID = id_text.getText();
                String passwrd = pwrd.getText();
                if (loginID.equals("aa") && passwrd.equals("bb")) {
                    Main nextPage = new Main();
                    nextPage.homeScreen();
                    jf.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "WRONG LOGIN ID/PASSWORD");
                    id_text.setText("");
                    pwrd.setText("");
                }
            }
        });

        jf.getContentPane().setBackground(new Color(167, 197, 241));
        jf.setSize(400, 200);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void homeScreen() {

        JFrame frame = new JFrame("NITTE HOSTEL LEAVE MANAGER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 400);
        frame.getContentPane().setBackground(new Color(167, 197, 241));
        frame.setLocationRelativeTo(null);

        JButton leave = new JButton("APPLY FOR LEAVE");
        JButton complaints = new JButton("COMPLAINTS");
        JButton announcements = new JButton("ANNOUNCEMENTS");
        JLabel collegeName = new JLabel("NITTE Hostels, NMIT College");
        JLabel collegeAddress = new JLabel("Yelahanka,Bangalore - 560064");
        Font clgNameFont = new Font("TimesNewRoman", Font.BOLD, 30);
        collegeName.setFont(clgNameFont);
        collegeAddress.setFont(new Font("TimesNewRoman", Font.ROMAN_BASELINE, 20));
        collegeName.setHorizontalAlignment(SwingConstants.CENTER);
        collegeAddress.setHorizontalAlignment(SwingConstants.CENTER);
        collegeName.setBounds(280, 10, 420, 100);
        collegeAddress.setBounds(280, 50, 420, 100);

        leave.setBounds(60, 180, 250, 60);
        complaints.setBounds(350, 180, 250, 60);
        announcements.setBounds(650, 180, 250, 60);

        announcementsArea = new JTextArea(); // Initialize here
        announcementsArea.setBounds(60, 250, 840, 100);
        announcementsArea.setEditable(false);
        JScrollPane announcementsScrollPane = new JScrollPane(announcementsArea);
        announcementsScrollPane.setBounds(60, 250, 840, 100);

        leave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Main().leaveForm();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        complaints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Main().complaintForm();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        announcements.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Main().announcementForm();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        frame.add(collegeName);
        frame.add(collegeAddress);
        frame.add(leave);
        frame.add(complaints);
        frame.add(announcements);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    class LeaveDetails {
        String leaveType, fromdate, todate, reason, place, mode;

        LeaveDetails() {
        }
    }

    public void leaveForm() throws IOException {

        JFrame frame = new JFrame("NITTE HOSTEL LEAVE MANAGER");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(167, 197, 241));

        JLabel leaveType = new JLabel("SELECT LEAVE TYPE");
        leaveType.setBounds(20, 10, 150, 30);
        JTextField dropdown = new JTextField();
        dropdown.setBounds(160, 10, 300, 30);

        JLabel from = new JLabel("From Date : ");
        from.setBounds(20, 60, 100, 30);
        JTextField fromCalendar = new JTextField();
        fromCalendar.setBounds(110, 60, 183, 25);
        JTextField toCalendar = new JTextField();

        JLabel to = new JLabel("To date : ");
        to.setBounds(20, 100, 100, 30);
        toCalendar.setBounds(110, 100, 183, 25);
        JTextField leaveReason = new JTextField();
        JLabel leaveReasonLabel = new JLabel("Select Leave Reason : ");
        leaveReasonLabel.setBounds(20, 150, 150, 30);
        leaveReason.setBounds(160, 150, 280, 30);

        JLabel contactDetails = new JLabel("Parents Contact Details : ");
        JTextField parentsName = new JTextField("RAJESH KUMAR VAISH");
        JTextField parentsMobNo = new JTextField("9798657090");
        parentsName.setEditable(false);
        parentsMobNo.setEditable(false);
        contactDetails.setBounds(20, 190, 150, 30);
        parentsName.setBounds(20, 230, 200, 30);
        parentsMobNo.setBounds(230, 230, 200, 30);

        JLabel approverLabel = new JLabel("Note to the Approver : ");
        JLabel placeVisit = new JLabel("Place Of Visit : ");
        JTextField placeOfVisit = new JTextField();
        JLabel modeVisit = new JLabel("Mode Of Visit : ");
        JTextField modeOfVisit = new JTextField();
        approverLabel.setBounds(20, 280, 200, 30);
        placeVisit.setBounds(20, 320, 100, 30);
        placeOfVisit.setBounds(130, 330, 200, 20);
        modeVisit.setBounds(20, 350, 100, 30);
        modeOfVisit.setBounds(130, 360, 200, 20);

        JCheckBox termsAndConditions = new JCheckBox("I Accept all the Terms and Conditions .");
        termsAndConditions.setBounds(20, 400, 250, 30);

        JButton apply = new JButton("APPLY");
        JButton refresh = new JButton("REFRESH");
        apply.setBounds(100, 470, 100, 30);
        refresh.setBounds(300, 470, 100, 30);

        frame.add(leaveType);
        frame.add(dropdown);
        frame.add(from);
        frame.add(fromCalendar);
        frame.add(to);
        frame.add(toCalendar);
        frame.add(leaveReasonLabel);
        frame.add(leaveReason);
        frame.add(contactDetails);
        frame.add(parentsName);
        frame.add(parentsMobNo);
        frame.add(approverLabel);
        frame.add(placeVisit);
        frame.add(placeOfVisit);
        frame.add(modeVisit);
        frame.add(modeOfVisit);
        frame.add(termsAndConditions);
        frame.add(apply);
        frame.add(refresh);

        frame.setLayout(null);
        frame.setVisible(true);

        File file = new File("E:\\Coding\\Java\\Database.txt");
        BufferedWriter fw = new BufferedWriter(new FileWriter(file, true));
        fw.write("Leave Type\tFrom Date\t\tTo Date\t\tLeave Reason\tPlace Of visit\tMode Of visit\n");
        // fw.close();
        apply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // FileWriter fw1 = new FileWriter(file);
                    fw.write(dropdown.getText() + "\t\t" + fromCalendar.getText() + "\t\t" + toCalendar.getText() + "\t\t" + leaveReason.getText() + "\t\t" + placeOfVisit.getText() + "\t\t" + modeOfVisit.getText() + "\n");
                    fw.flush();

                    dropdown.setText("");
                    fromCalendar.setText("");
                    toCalendar.setText("");
                    leaveReason.setText("");
                    placeOfVisit.setText("");
                    modeOfVisit.setText("");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dropdown.setText("");
                fromCalendar.setText("");
                toCalendar.setText("");
                leaveReason.setText("");
                placeOfVisit.setText("");
                modeOfVisit.setText("");
            }
        });
    }

    public void complaintForm() throws IOException {

        JFrame frame = new JFrame("NITTE HOSTEL LEAVE MANAGER");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(167, 197, 241));

        JTextField category = new JTextField();
        JLabel categoryLabel = new JLabel("Enter Category : ");
        categoryLabel.setBounds(20, 20, 100, 30);
        category.setBounds(20, 50, 450, 30);

        JTextField subCategory = new JTextField();
        JLabel subCategoryLabel = new JLabel("Enter Sub Category : ");
        subCategoryLabel.setBounds(20, 80, 150, 30);
        subCategory.setBounds(20, 110, 450, 30);

        JLabel urgency = new JLabel("Urgency");
        JCheckBox basic = new JCheckBox("BASIC");
        JCheckBox medium = new JCheckBox("MEDIUM");
        JCheckBox critical = new JCheckBox("CRITICAL");
        ButtonGroup urgencyGroup = new ButtonGroup();
        urgencyGroup.add(basic);
        urgencyGroup.add(medium);
        urgencyGroup.add(critical);
        JPanel urgencyCheckBox = new JPanel();
        urgencyCheckBox.setLayout(new GridBagLayout());
        GridBagConstraints urgencyConstraints = new GridBagConstraints();
        urgencyConstraints.gridx = GridBagConstraints.RELATIVE;
        urgencyConstraints.gridy = 1;
        urgencyCheckBox.add(basic, urgencyConstraints);
        urgencyCheckBox.add(medium, urgencyConstraints);
        urgencyCheckBox.add(critical, urgencyConstraints);
        urgency.setBounds(20, 150, 50, 30);
        urgencyCheckBox.setBounds(100, 150, 250, 30);

        JLabel description = new JLabel("Describe Your Complain: ");
        JTextField descriptionField = new JTextField();
        description.setBounds(20, 180, 200, 30);
        descriptionField.setBounds(20, 220, 400, 200);

        JButton submit = new JButton("SUBMIT");
        JButton refresh = new JButton("REFRESH");
        submit.setBounds(100, 470, 100, 30);
        refresh.setBounds(300, 470, 100, 30);

        frame.add(categoryLabel);
        frame.add(category);
        frame.add(subCategoryLabel);
        frame.add(subCategory);
        frame.add(urgency);
        frame.add(urgencyCheckBox);
        frame.add(description);
        frame.add(descriptionField);
        frame.add(submit);
        frame.add(refresh);

        frame.setLayout(null);
        frame.setVisible(true);
        File complains = new File("E:\\Coding\\Java\\complains.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(complains));
        bw.write("Category\tSub - Category\t Description");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    bw.write(category.getText() + "\t" + subCategory.getText() + "\t" + descriptionField.getText()+ "\n");
                    bw.flush();

                    category.setText("");
                    subCategory.setText("");
                    descriptionField.setText("");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                category.setText("");
                subCategory.setText("");
                descriptionField.setText("");
            }
        });
    }

    public void announcementForm() throws IOException {
        JFrame frame = new JFrame("NITTE HOSTEL ANNOUNCEMENT");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(167, 197, 241));

        JLabel titleLabel = new JLabel("Announcement Title:");
        titleLabel.setBounds(20, 20, 150, 30);
        JTextField titleField = new JTextField();
        titleField.setBounds(20, 50, 450, 30);

        JLabel contentLabel = new JLabel("Announcement Content:");
        contentLabel.setBounds(20, 90, 150, 30);
        JTextArea contentArea = new JTextArea();
        contentArea.setLineWrap(true);
        JScrollPane contentScrollPane = new JScrollPane(contentArea);
        contentScrollPane.setBounds(20, 130, 450, 150);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(100, 300, 100, 30);
        JButton refresh = new JButton("REFRESH");
        refresh.setBounds(300, 300, 100, 30);

        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(contentLabel);
        frame.add(contentScrollPane);
        frame.add(submit);
        frame.add(refresh);

        frame.setLayout(null);
        frame.setVisible(true);

        File announcements = new File("E:\\Coding\\Java\\announcements.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(announcements, true));

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    bw.write(titleField.getText() + "\t" + contentArea.getText() + "\n");
                    bw.flush();

                    titleField.setText("");
                    contentArea.setText("");
                    announcementsArea.setText("");
                    readAnnouncements(announcementsArea);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titleField.setText("");
                contentArea.setText("");
            }
        });
    }

    public void readAnnouncements(JTextArea announcementsArea) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\Coding\\Java\\announcements.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            announcementsArea.append(line + "\n");
        }
        br.close();
    }

    public static void main(String[] args) {

        new Main().login();
    }
}
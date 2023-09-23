# Java-Project

# Hostel Leave Management System

A comprehensive Hostel Leave Management System developed using Java and Swing.

## Technologies Used

- Java
- Swing (GUI)
- File I/O

## Features

- User Authentication
- Leave Management
- Complaints Submission
- Real-time Announcements
- Dynamic Forms
- Data Storage
- User-friendly Interface

## Usage Instructions

1. **Login:**
   - Launch the application.
   - Enter your login credentials (e.g., login ID and password).

2. **Leave Application:**
   - Click "Apply for Leave."
   - Fill out the leave application form.
   - Click "Apply" to submit the leave request.
   - Click "Refresh" to clear the form.

3. **Complaint Submission:**
   - Click "Complaints."
   - Provide complaint details including category and urgency.
   - Click "SUBMIT" to submit the complaint.
   - Click "REFRESH" to clear the form.

4. **Announcements:**
   - Click "Announcements" to view real-time updates.

## Code Overview

- **Login:** Handles user authentication.
- **Home Screen:** Displays main options.
- **Leave Form:** Allows leave application and data storage.
- **Complaint Form:** Enables complaint submission.
- **Announcement Form:** Admin can make announcements.

## Installation

1. Clone the repository.
2. Ensure Java is installed.
3. Compile and run the Main class.

## Screenshots

1. **User Registration:**
   
   The system allows hostel administrators, students, and parents/guardians to register and create their accounts with relevant details. Each user type will have different access levels and 
permissions.

   **User Types:** The Hostel Leave Manager typically supports different user types, each with specific roles and permissions. The main user types are:

   - **Student:** Students are the primary users who request leaves. They register using their personal details such as name, contact information, student ID, and any other relevant information required by the hostel administration.
  
   - **Parent/Guardian:** If the student is a minor, the system allows parents or guardians to register and link their account to the student's profile. This allows parents to receive notifications and stay updated on the leave requests and approvals.
  
   - **Hostel Warden/Administrator:** Hostel wardens or administrators are responsible for overseeing the leave approval process. They register with their official credentials and are granted access to manage leave requests, approve or reject them, and perform other administrative tasks.

![Screenshot 2023-09-23 132426](https://github.com/piyush901255/Java-Project/assets/142660350/5d995d96-95ef-480b-9443-25ff3d88eb52)

Figure 1: As the Program is executed, the GUI pops up asking for the Registered User Id and Password for the Security reasons.

![Screenshot 2023-09-23 132436](https://github.com/piyush901255/Java-Project/assets/142660350/616e8025-c14a-41d7-b8ee-d606ce9fbbce)

Figure 2: Incorrect Pop up appears if any credentials found incorrect.

2. **Dashboard**

   The Dashboard shows the heading as NITTE Hostels, NMIT College, followed by a subheading as the location of the College.

   It is followed by three options:

   - **Apply For Leave:**
If the student wants to apply for leave or out pass, he/she must click the Apply For Leave button.

   - **Complaints:**
A dedicated section for accessing complaints faced by the students, such as fan is not working, or contact information for the system's support team, can be available on the dashboard.

   - **Announcements:**
Important Notifications: The dashboard may feature a notification centre where users can receive updates, reminders, or alerts related to their leave requests or other hostel-related announcements.


![Screenshot 2023-09-23 132454](https://github.com/piyush901255/Java-Project/assets/142660350/af288c30-a629-4a2c-b1d5-74b7abf72b93)

Figure 3: Dashboard - Select your field of interest.

3. **Leave Request Submission Form**

   The Leave Request Submission Form in the Hostel Leave Manager is a crucial component that enables students to formally request permission to leave the hostel for a specific duration. It is designed to gather essential information from the students, ensuring that the hostel administration can make informed decisions while processing the leave requests. Here are more details on what the Leave Request Submission Form typically includes:
   
   - **Leave Details:**
     
      Leave Start Date and Time: The date and time when the student intends to leave the hostel.
   
      Leave End Date and Time: The date and time when the student plans to return to the hostel.
   
      Reason for Leave: A dropdown or text box where the student can specify the reason for the leave, such as medical, personal, family event, etc.
   
   - **Parent/Guardian Information:**
     
      Name of Parent/Guardian: If the student is a minor, the form may require the name of the responsible parent or guardian.
     
      Parent/Guardian Contact Information: Phone number of the parent or guardian is fixed and cannot be edited by the students end. It can only be changed as per the request by the Hostel In charge.

   - **Emergency Contact:**
     
      Name of Emergency Contact: The name of a person to be contacted in case of an emergency.
     
      Emergency Contact Relationship: The relationship of the emergency contact to the student (e.g., parent, sibling, relative).
     
      Emergency Contact Number: Phone number of the emergency contact.
     
   - **Terms and Conditions:**
      The form may include a checkbox or statement asking the student to agree to the hostel's terms and conditions regarding leave requests. This ensures that students are aware of the rules and policies related to leaves.
   
   - **Submission and Confirmation:**

      A "Submit" button: After filling in all the required information, the student clicks this button to submit the leave request.
      Confirmation Message: Upon successful submission, a confirmation message is displayed, indicating that the request has been received and is pending review.
   
   - **Note to the Approval:**

      It includes the place of Visit and the mode of transport. It's important to design the Leave Request Submission Form to be user-friendly and intuitive. The form should be accessible on various devices, such as desktops, laptops, tablets, and smartphones. Additionally, the form may include input validation to ensure that all required fields are filled in correctly before submission.

Once the student submits the leave request, it enters the approval workflow, where hostel administrators or wardens review the request and either approve or reject it based on the hostel's policies and availability. Throughout the process, the system should provide realtime updates to the student and, if applicable, the parent/guardian, keeping them informed about the status of the leave request.


![Screenshot 2023-09-23 132509](https://github.com/piyush901255/Java-Project/assets/142660350/08bb417f-f57a-4bf6-8226-d5ab2c923f31)

Figure 4: Leave Request Submission


![Screenshot 2023-09-23 132534](https://github.com/piyush901255/Java-Project/assets/142660350/787c3f84-06f1-4512-94ff-2d97ae1ba2ab)

![Screenshot 2023-09-23 132551](https://github.com/piyush901255/Java-Project/assets/142660350/1fc56942-5a31-4a92-a1f7-2b6fff5ed0a5)


## Contributing

Contributions are welcome! Please follow the standard guidelines.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- Thanks to [Resource Name](resource_link) for the tutorial on XYZ.
- Used [Library Name](library_link) for handling file I/O.

## Contact

For questions or feedback, reach out to [Piyush Narayan](mailto:piyush901255@gmail.com).

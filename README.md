Solvei8 Backend - Training Center Registry 🚀
A simple Spring Boot REST API to register and retrieve government-funded training centers with proper validation, database integration, and exception handling.

🛠 Tech Stack
✅ Backend: Java, Spring Boot, Spring Data JPA
✅ Database: H2 (default) / MySQL (optional)
✅ Validation & Exception Handling

Project Setup in STS4
1️⃣ Clone the repo:

sh
Copy
Edit
git clone https://github.com/your-username/traini8-backend.git
cd traini8-backend
2️⃣ Open in STS4 → File → Import → Existing Maven Project
3️⃣ Run the project → Right-click Traini8Application.java → Run As → Spring Boot App

📡 API Endpoints
Method	Endpoint	Description
POST	/training-centers	Register a training center
GET	/training-centers	Get all training centers
Example POST Request
json
Copy
Edit
{
  "centerName": "Tech Academy",
  "centerCode": "ABC123XYZ456",
  "address": { "detailedAddress": "123 Street", "city": "Lucknow", "state": "UP", "pincode": "226001" },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Python"],
  "contactEmail": "info@techacademy.com",
  "contactPhone": "9876543210"
}
📌 Running as JAR
sh
Copy
Edit
mvn clean package  
java -jar target/traini8backend-0.0.1-SNAPSHOT.jar  

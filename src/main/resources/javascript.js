// Validation for Time Logging Form
document.getElementById("timeLogForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const startTime = document.getElementById("startTime").value;
    const endTime = document.getElementById("endTime").value;
    const taskDescription = document.getElementById("taskDescription").value;

    if (!startTime || !endTime || !taskDescription) {
        alert("All fields are required.");
        return;
    }

    if (new Date(`1970-01-01T${endTime}`) <= new Date(`1970-01-01T${startTime}`)) {
        alert("End time must be after start time.");
        return;
    }

    alert("Time log submitted successfully!");
    // Here, you can add logic to save the data (e.g., send to the server).
});
// Toggle visibility of tables
document.querySelectorAll("table").forEach((table) => {
    table.style.display = "none";
});

document.querySelector("h2").addEventListener("click", function () {
    const table = this.nextElementSibling;
    table.style.display = table.style.display === "none" ? "block" : "none";
});

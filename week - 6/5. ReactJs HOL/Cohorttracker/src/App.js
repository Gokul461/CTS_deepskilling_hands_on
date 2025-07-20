import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  const cohorts = [
    { name: "React Bootcamp", status: "ongoing", startDate: "2024-08-01", endDate: "2024-09-30" },
    { name: "Java Fundamentals", status: "completed", startDate: "2024-06-01", endDate: "2024-07-15" }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Cohort Tracker</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;

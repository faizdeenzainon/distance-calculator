// script.js

function calculateDistance() {
    const distance1 = parseFloat(document.getElementById('distance1').value);
    const unit1 = document.getElementById('unit1').value;
    const distance2 = parseFloat(document.getElementById('distance2').value);
    const unit2 = document.getElementById('unit2').value;

    // Make an API request to the backend
    fetch('http://localhost:8080/calculate-distance', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            distance1,
            unit1,
            distance2,
            unit2,
            outputUnit: 'meters', // Specify the desired output unit
        }),
    })
    .then(response => response.json())
    .then(data => {
        // Update the UI with the calculated distance and unit
        document.getElementById('result').innerText = `Total Distance: ${data.result} ${data.unit}`;
    })
    .catch(error => {
        console.error('Error:', error);
        // Handle error, e.g., display an error message on the UI
    });
}

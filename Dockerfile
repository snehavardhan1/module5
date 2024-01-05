# Use an official Node.js runtime as a parent image
FROM node:14

# Set the working directory in the container
WORKDIR c/Users/12167/.ssh/module5

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install app dependencies
RUN npm install

# Copy the rest of the application code to the working directory
COPY . .

# Expose a port (if your application requires it)
EXPOSE 3000

# Define the command to run your application
CMD ["npm", "start"]


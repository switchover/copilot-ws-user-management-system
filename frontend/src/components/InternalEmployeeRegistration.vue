<template>
  <div>
    <h2>Internal Employee Registration</h2>
    <form @submit.prevent="registerInternalEmployee">
      <div>
        <label for="employeeNumber">Employee Number:</label>
        <input type="text" id="employeeNumber" v-model="employeeNumber" required>
      </div>
      <div>
        <label for="name">Name:</label>
        <input type="text" id="name" v-model="name" required>
      </div>
      <div>
        <label for="department">Department:</label>
        <input type="text" id="department" v-model="department" required>
      </div>
      <button type="submit">Register</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      employeeNumber: '',
      name: '',
      department: ''
    };
  },
  methods: {
    registerInternalEmployee() {
      // Add logic to handle internal employee registration
      console.log('Internal employee registered:', this.employeeNumber, this.name, this.department);
    }
  }
};
</script>

<style scoped>
/* Add your styles here */
</style>

<template>
  <div>
    <h2>External Employee Registration</h2>
    <form @submit.prevent="registerExternalEmployee">
      <div>
        <label for="name">Name:</label>
        <input type="text" id="name" v-model="name" required>
      </div>
      <div>
        <label for="dateOfBirth">Date of Birth:</label>
        <input type="date" id="dateOfBirth" v-model="dateOfBirth" required>
      </div>
      <div>
        <label for="contactInfo">Contact Information:</label>
        <input type="text" id="contactInfo" v-model="contactInfo" required>
      </div>
      <div>
        <label for="storeCode">Store Code:</label>
        <input type="text" id="storeCode" v-model="storeCode" required>
      </div>
      <button type="submit">Register</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      name: '',
      dateOfBirth: '',
      contactInfo: '',
      storeCode: ''
    };
  },
  methods: {
    registerExternalEmployee() {
      // Add logic to handle external employee registration
      console.log('External employee registered:', this.name, this.dateOfBirth, this.contactInfo, this.storeCode);
    }
  }
};
</script>

<style scoped>
/* Add your styles here */
</style>

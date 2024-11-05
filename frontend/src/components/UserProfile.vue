<template>
  <div>
    <h2>User Profile</h2>
    <form @submit.prevent="updateUserProfile">
      <div>
        <label for="name">Name:</label>
        <input type="text" id="name" v-model="name" required>
      </div>
      <div>
        <label for="email">Email:</label>
        <input type="email" id="email" v-model="email" required>
      </div>
      <div>
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" v-model="phoneNumber" required>
      </div>
      <div>
        <label for="storeCode">Store Code:</label>
        <input type="text" id="storeCode" v-model="storeCode" required>
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" v-model="password" required>
      </div>
      <button type="submit">Update</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      name: '',
      email: '',
      phoneNumber: '',
      storeCode: '',
      password: ''
    };
  },
  methods: {
    updateUserProfile() {
      // Add logic to handle user profile update
      console.log('User profile updated:', this.name, this.email, this.phoneNumber, this.storeCode, this.password);
    }
  }
};
</script>

<style scoped>
/* Add your styles here */
</style>

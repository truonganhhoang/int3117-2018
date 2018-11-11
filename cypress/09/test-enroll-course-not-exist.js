describe('Test Enroll Course Not Exist', () => {
    beforeEach(() => {
        window.localStorage.setItem(
            'currentUser',
            `{"__v":0,"uid":"465462","email":"fatt@zlmsl0rkw0232hph.ga","username":"nguyencong","firstname":"Cong","lastname":"Nguyen","avatar":"/avatar.jpg","role":"member","_id":"5bd706b44599e143b4449502","language":"vi","score":0}`
        );
        window.localStorage.setItem('redirectAfterLogin', `/folder/0`);
        window.localStorage.setItem(
            'token',
            'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoibWVtYmVyIiwidWlkIjoiNDY1NDYyIiwiaWF0IjoxNTQwODE4NjEyLCJleHAiOjE1NDA5MDUwMTJ9.EiJj924CANQ_Y1HU6Aesbxlp6fRMSYUTtqNs6ohjJxc'
        );

        cy.visit('https://hoclieu.sachmem.vn/folder/0');
        cy.get('a.text-dark')
            .contains('Lớp học của tôi')
            .click();
    });

    it('Test My Class Url', () => {
        cy.location('pathname').should('include', 'live_class/classes');
    });

    it('Test Enroll Course Fail', () => {
        cy.get('a.btn.btn-primary')
            .contains('Tham gia lớp...')
            .click();

        cy.get('input[placeholder="Nhập mã tham gia"]')
            .type('fakeCourse')
            .should('have.value', 'fakeCourse');

        cy.get('input.btn.btn-primary')
            .contains('Lưu')
            .click();

        cy.get('.toast-title.ng-star-inserted').should('have.text', 'Lỗi!');
    });
});
